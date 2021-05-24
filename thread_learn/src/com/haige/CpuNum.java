package thread_learn.src.com.haige;

/**
 * @className: com.haige-> CpuNum
 * @description: learn
 * @author: cqh
 * @createDate: 2021-05-24 16:14
 * @version: 1.0
 * @todo:
 */
public class CpuNum {
    public static void main(String[] args){
        Runtime runtime = Runtime.getRuntime();
        //当前电脑的cpu数量
        int cpuNums = runtime.availableProcessors();
        // 6核
        System.out.println(cpuNums);
    }
}
