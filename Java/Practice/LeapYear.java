class LeapYear{
    public static void main(String[] args) {
        int year=2026;
        int month=9;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 Days");        
                break;
            case 4:
            case 6:
            case 9:
            case 11:System.out.println("30 Days");
            break;
            case 2:
                {
                    if((year%4==0 && year%100!=0)||(year%400==0)){
                        System.out.println("29 Days");
                    }else{
                        System.out.println("28 Days");
                    }
                }
                    break;
                
            default:
                System.out.println("Invalid month");
        }
    
    }
}