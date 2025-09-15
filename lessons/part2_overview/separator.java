package lessons.part2_overview;

import java.util.function.Consumer;

public class separator {
    {
        // đây là khối khởi tạo (initializer block) dùng {} để xác định khối mã
    }
    // () dấu ngoặc đơn - Dùng để chứa danh sách tham số trong định nghĩa và lời gọi phương thức. Cũng được dùng để xác định độ ưu tiên trong biểu thức, chứa biểu thức trong các câu lệnh điều khiển, và bao quanh các kiểu ép (cast types).
    public void parentheses() { 
       // if ()   method() 
       // ép kiểu cast type (int)  (double)
    }
    // [] dấu ngoặc vuông - Dùng để khai báo và truy cập các phần tử trong mảng (arrays).
    public static void brackets() { 
        int []  array = new int[5]; // dùng [] để khai báo mảng
        array[0] = 1; // dùng [] để truy cập phần tử mảng
    }
    // {} dấu ngoặc nhọn - Dùng để xác định khối mã (code blocks) trong các cấu trúc điều khiển, định nghĩa lớp (class), phương thức (method), và khối khởi tạo (initializer blocks).
    public static void braces() { 
        {
            int x = 10; // dùng {} để xác định khối mã
            System.out.println(x);
        }
        int[] array = {1, 2, 3}; // dùng {} để khởi tạo mảng trường hợp khởi tạo mảng rút gọn (array initializer shorthand).
        System.out.println(array);
    }

    // , dấu phẩy - Phân tách các định danh liên tiếp trong khai báo biến. Cũng dùng để nối các câu lệnh lại với nhau bên trong vòng lặp for.
    public static void comma() { 
        int a = 1, b = 2, c = 3; // dùng , để phân tách các định danh trong khai báo biến
        for (int i = 0, j = 10; i < j; i++, j--) { // dùng , để nối các câu lệnh trong vòng lặp for
            System.out.println("i: " + i + ", j: " + j + c + b);
        }
    }

    // ; kết thúc câu lệnh
    // . Dùng để phân tách tên gói (package) với các gói con (subpackage) và lớp. Cũng được dùng để phân tách biến hoặc phương thức khỏi biến tham chiếu.
    public static void period() { 
        System.out.println("Hello, World!"); // dùng . để phân tách biến tham chiếu và phương thức, dùng ; để kết thúc câu lệnh
    }

    // :: Dùng để tạo tham chiếu đến phương thức hoặc constructor.
    public static void Colons() { 
       // Class::new
       // Class::staticMethod
       // instance::instanceMethod
       // dùng để truyền tham chiếu hàm (method reference) có thể hiểu như truyền callback trong java script (góc hiểu cá nhân)
    }

    //...	Dấu ba chấm (Ellipsis)	Chỉ ra tham số có số lượng thay đổi (variable-arity parameter).
    public static void ellipsis(int ... numbers) { 
    // có thể truyền vào 0 hoặc nhiều số nguyên giá trị numbers trong hàm được xem là type[] trong trường hợp này là int[]
        System.out.println("Numbers length: " + numbers.length);
    }

    // bổ sung 
    // : colon - dùng trong for-each, trong switch (case:) dùng trong label.
    public static void colon() { 
        int[] array = {1, 2, 3};
        for (int number : array) { // dùng : trong for-each để phân tách biến và mảng
            System.out.println(number);
        }

        int day = 2;
        switch (day) {
            case 1: // dùng : trong switch-case để phân tách case và thân case
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Other day");
        }

        labelExample: // dùng : trong label để đánh dấu vị trí trong mã
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i * j > 6) {
                    break labelExample; // dùng break với label để thoát khỏi vòng lặp được đánh dấu
                }
                System.out.println(i + ", " + j);
            }
        }
        // @annotation: dùng trong khai báo chú thích (annotation declaration) và áp dụng chú thích (annotation application).
    }
    // -> Dùng trong biểu thức lambda để phân tách danh sách tham số và thân hàm.
    public static void arrow() { 
        Consumer<String> print = message -> System.out.println(message); // dùng -> để phân tách tham số và thân hàm trong biểu thức lambda
        print.accept("Hello, Lambda!");
    }

    // @ : annotation - Dùng để khai báo và áp dụng chú thích (annotations).
    public static void main(String[] args) {
       
        System.out.println("Hello World");
    }
}
