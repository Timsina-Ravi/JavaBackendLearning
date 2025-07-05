public class studentManagement {
    int count = 0;
    Student[] students = new Student[200];

    public void addStudent(int id, String name, String grade) {

        if (id <= 0 || name.isEmpty()) {
            System.out.println("Invalid data.");
            return;
        }

        if (count >= students.length) {
            System.out.println("Student list is full.");
            return;
        }



        students[count] = new Student(id, name, grade);
        count++;
        System.out.println("Student added successfully");
    }

    public void viewStudent() {

        if (count == 0) {
            System.out.println("No students to show.");
            return;
        }


        for (int i = 0; i < count; i++) {
            System.out.println("Details: " + students[i].toString());
        }
    }

    public void updateStudent(int id, String newName, String newGrade) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (students[i].getId() == id) {
                students[i].setName(newName);
                students[i].setGrade(newGrade);
                System.out.println("Student Details updated Successfully");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Enter a valid id");
        }
    }


    // to undestand how to delete an elemnt of an index in an array
    //   arrays =   20   30    40
    // to remove 30 we should find it first
    // then replace its position with 40 and make 40's position(last position )
    // as null it will make the arry of size 2 i.e it removes 30 now make count -1


    public void deleteStudent(int id) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (students[i].getId() == id) {

                for (int j = i; j < count - 1; j++) {       // here j = will 0 then 1 then 2 and so on ----> values of i
                    students[j] = students[j + 1];         // keeps like this students[1] = students[1+1] ------>> this is students[1] = students[2]
                    // this makes in place of 30  it keeps 40
                }

                students[count - 1] = null;                        // makes last element as null
                count--;                                            // if the array size is 2 now it will be 1
                   found = true;
                System.out.println("Deleted student detail");
                break;

            }
        }
        if (!found) {
            System.out.println("Id not found");
        }

    }
        public void searchByID ( int id){
        boolean found = false;
            for (int i = 0; i < count; i++) {
                if (students[i].getId() == id) {
                    System.out.println("Details: " + students[i].toString());
                      found = true;
                      break;
                }
            }

            if (!found){
                System.out.println("ID not found.");

            }

        }
    }
