import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import entity.StudentEntity;
import entity.embedded.StudentName;
import repository.StudentRepository;
import util.SessionFactoryConfiguration;

public class App {
    public static void main(String[] args) throws Exception {
       StudentRepository repo=new StudentRepository();
       StudentEntity entity=new StudentEntity();
       entity.setNic("869541326V");
       StudentName studentName=new StudentName("stu 1","stu last 1");

       entity.setName(studentName);
       List <String> mobiles=new ArrayList<>();
       mobiles.add("0778569412");
       mobiles.add("0715213647");
       entity.setMobiles(mobiles);

       repo.saveStudent(entity);


    }
}
