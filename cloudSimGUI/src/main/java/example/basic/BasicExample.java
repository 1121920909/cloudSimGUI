package example.basic;

import com.sun.istack.internal.Nullable;
import org.cloudbus.cloudsim.*;
import org.cloudbus.cloudsim.provisioners.BwProvisionerSimple;
import org.cloudbus.cloudsim.provisioners.PeProvisionerSimple;
import org.cloudbus.cloudsim.provisioners.RamProvisionerSimple;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BasicExample {
    protected List<Cloudlet> cloudletList;
    protected List<Vm> vmList;
    protected List<Cloudlet> resultCloudletList;
    protected DatacenterBroker createBroker(String name){
        DatacenterBroker datacenterBroker = null;
        try {
            if(datacenterBroker == null){
                datacenterBroker = new DatacenterBroker(name);
            }
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
        return datacenterBroker;
    }
    protected Datacenter createDatacenter(String name) {

        // Here are the steps needed to create a PowerDatacenter:
        // 1. We need to create a list to store
        // our machine
        List<Host> hostList = new ArrayList<Host>();

        // 2. A Machine contains one or more PEs or CPUs/Cores.
        // In this example, it will have only one core.
        List<Pe> peList = new ArrayList<Pe>();

        int mips = 1000;

        // 3. Create PEs and add these into a list.
        peList.add(new Pe(0, new PeProvisionerSimple(mips))); // need to store Pe id and MIPS Rating

        // 4. Create Host with its id and list of PEs and add them to the list
        // of machines
        int hostId = 0;
        int ram = 2048; // host memory (MB)
        long storage = 1000000; // host storage
        int bw = 10000;

        hostList.add(
                new Host(
                        hostId,
                        new RamProvisionerSimple(ram),
                        new BwProvisionerSimple(bw),
                        storage,
                        peList,
                        new VmSchedulerTimeShared(peList)
                )
        ); // This is our machine

        // 5. Create a DatacenterCharacteristics object that stores the
        // properties of a data center: architecture, OS, list of
        // Machines, allocation policy: time- or space-shared, time zone
        // and its price (G$/Pe time unit).
        String arch = "x86"; // system architecture
        String os = "Linux"; // operating system
        String vmm = "Xen";
        double time_zone = 10.0; // time zone this resource located
        double cost = 3.0; // the cost of using processing in this resource
        double costPerMem = 0.05; // the cost of using memory in this resource
        double costPerStorage = 0.001; // the cost of using storage in this
        // resource
        double costPerBw = 0.0; // the cost of using bw in this resource
        LinkedList<Storage> storageList = new LinkedList<Storage>(); // we are not adding SAN
        // devices by now

        DatacenterCharacteristics characteristics = new DatacenterCharacteristics(
                arch, os, vmm, hostList, time_zone, cost, costPerMem,
                costPerStorage, costPerBw);

        // 6. Finally, we need to create a PowerDatacenter object.
        Datacenter datacenter = null;
        try {
            datacenter = new Datacenter(name, characteristics, new VmAllocationPolicySimple(hostList), storageList, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return datacenter;
    }
    public String formatInfo(){
        StringBuilder sb = new StringBuilder();
        Cloudlet cloudlet;
        String indent = "\t";
        sb.append("========== OUTPUT ==========\n");
        sb.append("Cloudlet ID\tSTATUS\tData center ID\tVM ID\tTime\tStart Time\tFinish Time\n");
        DecimalFormat dft = new DecimalFormat("###.##");
        for(int i = 0;i < cloudletList.size();i++){
            cloudlet = cloudletList.get(i);
            sb.append(cloudlet.getCloudletId() + indent);
            if(cloudlet.getStatus() == Cloudlet.SUCCESS){
                sb.append("SUCCESS" + indent + cloudlet.getResourceId()
                        + indent + cloudlet.getVmId()
                        + indent
                        + dft.format(cloudlet.getActualCPUTime()) + indent
                        + dft.format(cloudlet.getExecStartTime())
                        + indent
                        + dft.format(cloudlet.getFinishTime()) + "\n");
            }

        }
        return sb.toString();
    }
}
