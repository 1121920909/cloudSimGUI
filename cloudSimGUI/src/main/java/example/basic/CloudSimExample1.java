package example.basic;

import org.cloudbus.cloudsim.Cloudlet;
import org.cloudbus.cloudsim.Datacenter;
import org.cloudbus.cloudsim.DatacenterBroker;
import org.cloudbus.cloudsim.Vm;
import org.cloudbus.cloudsim.core.CloudSim;

import java.util.Calendar;
import java.util.List;

public class CloudSimExample1 extends BasicExample{
    private List<Cloudlet> cloudletList;
    private List<Vm> vmList;
    public CloudSimExample1(){
        int userNum = 1;    //用户数量
        Calendar calendar = Calendar.getInstance();
        boolean traceFlag = false;
       // CloudSim.init(userNum,calendar,traceFlag); //初始化CloudSim
        Datacenter datacenter0 = createDatacenter("DataCenter_0");
        DatacenterBroker datacenterBroker = createBroker("Broker");
        int borkerId = datacenterBroker.getId();
        System.out.println(borkerId);
    }

}
