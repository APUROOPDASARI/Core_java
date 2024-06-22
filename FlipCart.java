// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        String ptype="online";
        double TC=20000,Dis=0,cup=0,Balence=15000,Sp=0,Tc=0;
        if((TC-Balence)==5000){
            Sp=(TC*2)/100;
            Tc=TC-Sp;
        }
        if(Tc>15000){
            cup=(Tc*2)/100;
        }
        if(ptype=="online"){
            Dis=(TC*3)/100;
        }
        // if(TC>2500){
        //     cup=2500*30/100;
        // }
       System.out.println("Total cost "+(TC-Dis-Sp-cup));
    }
}