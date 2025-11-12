public class TimeCalc {
    public static void main(String[] args) {
        //10:15 + 15 = 10:30
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		int plusMinutes = Integer.parseInt(args[1]);
        
        hours = hours + plusMinutes/60;
        minutes = minutes + plusMinutes%60;
        if (minutes>=60) {
            hours += 1;
            minutes = minutes - 60;
        }
        
        hours = hours%24;
        
        if (hours<10&&minutes<10) {
            System.out.println("0" + hours + ":" + "0" + minutes);
        }
        else if (hours<10) {
            System.out.println("0" + hours + ":" + minutes);
        }
        else if (minutes<10) {
            System.out.println(hours + ":" + "0" + minutes);
        }
        else 
        System.out.println(hours + ":" + minutes);
    }
}
