class A{
A(){
System.out.println("In A");
}
}

class B extends A{
B(){
System.out.println("In B");
}
}

class C extends B{
C(){
System.out.println("In C");
}
}

public class DemoInheritance{
public static void main(String [] args){
C ob=new C();
}
}

// jari khali "C ha object call kelela asla tari pn output ABC asch print houn yenar karan ki inheritace madhe output/program Base class pasun Compile/run hot....mhanun ouput ABC asch print zal.