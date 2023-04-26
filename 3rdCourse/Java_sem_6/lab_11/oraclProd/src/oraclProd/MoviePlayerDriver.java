package oraclProd.src.oraclProd;

//step 12
public class MoviePlayerDriver {
    public void moviePlayerTest() {
        MoviePlayer mp = new MoviePlayer("Sony", MonitorType.LED, new Screen("920x240", 40, 22));
        System.out.println(mp);
    }
}
