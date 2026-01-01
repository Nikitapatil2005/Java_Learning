public class Variables {
    int instanceVar =10;

    static String staticVar = "Nikita";
    public void showVariables(){
        int localVar =5;

        System.out.println("Instance Variable is"+ instanceVar);
        System.out.println("Static Variable is"+ staticVar);
        System.out.println("Local Vaiable is"+localVar);
        
    }
    public static void main(String[] args) {
        Variables obj1 =new Variables();
        obj1.showVariables();

        System.out.println("Accesing Static via class name" +Variables.staticVar);
        
    }
}
