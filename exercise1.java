public class Activity1 {

    static boolean iWillBehave = true;
    static boolean iWillGraduate = true;

    public static void main(String[] args) throws Exception{

        assert iWillBehave == true : "Angas mo naman lods";

        College();

        assert iWillGraduate == true : "Eguls par";
    }

    static void College(){
        iWillGraduate = false;
        System.out.println("Panis si BBM");
    }
}
