public class Conditionals {
    public static void main(String[] args) {

        int salary = 31000;
//        if(salary > 12000){
//            salary = salary + 2500;
//        }
//        else{
//            salary= salary+1000;
//        }
        if(salary > 10000){
            salary += 2000;
        }
        else if(salary > 20000){
            salary += 3000;

        }else{
            salary += 1000;
        }
        System.out.println(salary);

    }
}