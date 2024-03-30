//Written By: Aaron A. Bigno
//this program is formatted using an HTML
public class LogTable {
    public static void main(String[] args) {
        double x, logx;//variable declaraction

        System.out.println("<html>");//opening table
        System.out.println("<body>");
        System.out.println("<table>");
        System.out.println("<tr><th>x</th><th>ln(x)</th></tr>");

        for (x = 1.0; x <= 20.0; x++) {//this loop iterates through x values(assume the log table shows 1 to 20)
            logx = Math.log(x);//calculates logarithm of x
            System.out.println("<tr><td>" + x + "</td><td>" + logx + "</td></tr>");//output
        }
        //closing table
        System.out.println("</table>");
        System.out.println("</body>");
        System.out.println("</html>");
    }
}