package creatingStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStream {

    public static void main(String[] args) {

        //Creating Stream from Array
        String[] courses = {"Java","Spring","Agile"};
        Stream<String> courseStream1 = Arrays.stream(courses); // Arrays.stream(referenceName)

        //Creating Stream from Collection
        List<String> courseList = Arrays.asList("Java","Spring","Agile");
        Stream<String> courseStream2 = courseList.stream(); // referenceName.stream()

        //Creating Stream from Custom Class
        List<Course> myCourses = Arrays.asList(
                new Course("Java",100),
                new Course("DS",101),
                new Course("MS",102)
        );

        Stream<Course> myCourseStream = myCourses.stream(); // referenceName.stream()

        //Creating Stream Values
        Stream<Integer> stream = Stream.of(1,2,3,4);





    }

}
