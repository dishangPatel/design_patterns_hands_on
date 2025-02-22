package design_pattern.structural.facade;

class TaskA{
    public void  doTaskA(){
        System.out.println("doing task A");
    }
}

class TaskB{
    public void  doTaskB(){
        System.out.println("doing task B");
    }
}

class TaskC{
    public void  doTaskC(){
        System.out.println("doing task C");
    }
}


class Facade {

    TaskA taskA;
    TaskB taskB;
    TaskC taskC;

    public  Facade() {
        taskA = new TaskA();
        taskB = new TaskB();
        taskC = new TaskC();
    }


    public void someComplexTask1(){

        taskA.doTaskA();
        taskB.doTaskB();
    }


    public void someComplexTask2(){
        taskC.doTaskC();
        taskA.doTaskA();
        taskB.doTaskB();
    }
}


