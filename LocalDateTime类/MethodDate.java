import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class MethodDate {

    public static void main(String[] args) { // LocalDateTime 和 LocalDate 类

        // 生成当前日期
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        System.out.println("============================================================");

        // 生成指定日期
        LocalDateTime dateTime1 = LocalDateTime.of(2024, 1, 2, 3, 4, 5);
        System.out.println(dateTime1);
        System.out.println("============================================================");

        // 字符串日期转换
        LocalDateTime parse = LocalDateTime.parse("2024-01-01T08:01:01"); // 固定格式
        System.out.println(parse);
        System.out.println("============================================================");

        // 获取年月日时分秒
        int year = dateTime1.getYear();
        Month month = dateTime1.getMonth();
        int day = dateTime1.getDayOfMonth();
        int hour = dateTime1.getHour();
        int minute = dateTime1.getMinute();
        int second = dateTime1.getSecond();
        System.out.println(year + " " + month.getValue() + " " + day + " " + hour + " " + minute + " " + second);
        System.out.println("============================================================");

        // 更改时间格式
        String stringDate = "2021-01-01 08:01:01";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); // 创建格式转换器 固定格式
        LocalDateTime dateTime2 = LocalDateTime.parse(stringDate, dateTimeFormatter); // 将时间转换为指定格式
        System.out.println(dateTime2);
        System.out.println("============================================================");

        // 获取本周第几天，本月第几天，本年第几天
        System.out.println(dateTime1); // 当前日期
        System.out.println(dateTime1.getDayOfWeek().getValue()); // 本周第几天 (不加getValue则显示周几)
        System.out.println(dateTime1.getDayOfMonth()); // 本月第几天
        System.out.println(dateTime1.getDayOfYear()); // 本年第几天
        System.out.println("============================================================");

        // 增加 / 减少日期，周，月，年
        LocalDateTime dateTime3 = dateTime1.plusDays(1); // 加一天
        System.out.println(dateTime3);

        LocalDateTime dateTime4 = dateTime1.minusDays(1); // 减一天
        System.out.println(dateTime4);
        System.out.println("============================================================");

        LocalDateTime dateTime5 = dateTime1.plusWeeks(1); // 加一周
        System.out.println(dateTime5);

        LocalDateTime dateTime6 = dateTime1.minusWeeks(1); // 减一周
        System.out.println(dateTime6);
        System.out.println("============================================================");

        LocalDateTime dateTime7 = dateTime1.plusMonths(1); // 加一月
        System.out.println(dateTime7);

        LocalDateTime dateTime8 = dateTime1.minusMonths(1); // 减一月
        System.out.println(dateTime8);
        System.out.println("============================================================");

        LocalDateTime dateTime9 = dateTime1.plusYears(1); // 加一年
        System.out.println(dateTime9);

        LocalDateTime dateTime10 = dateTime1.minusYears(1); // 减一年
        System.out.println(dateTime10);
        System.out.println("============================================================");


    }
}
