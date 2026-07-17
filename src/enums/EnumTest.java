package enums;

public class EnumTest {

    enum Months{
        JAN("1") , FEB("2") , MAR("3") , APR ("4") ;
        private String value;
        Months(String value){
            this.value = value;
        }
    }


    public static void main(String[] args) {

        Months months = Months.FEB;

        System.out.println(months + ":" + months.ordinal() + ":" + months.value);

        Months[] monthes = Months.values();

        for (Months month1 : monthes){

            System.out.println(month1 + ":" + month1.ordinal() + ":" + month1.value);
        }

    }
}
