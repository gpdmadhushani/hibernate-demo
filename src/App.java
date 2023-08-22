import java.util.ArrayList;
import java.util.List;

import javax.sound.midi.SysexMessage;

import org.hibernate.Session;

import entity.StudentEntity;
import entity.embedded.StudentName;
import repository.StudentRepository;
import util.SessionFactoryConfiguration;

public class App {
    public static void main(String[] args) throws Exception {
      // student save
        StudentRepository repo=new StudentRepository();
      /* StudentEntity entity=new StudentEntity();
       entity.setNic("769441326V");
       StudentName studentName=new StudentName("stu 3","stu last 3");
       entity.setName(studentName);
       List <String> mobiles=new ArrayList<>();
       mobiles.add("0788564102");
       mobiles.add("0715240247");
       entity.setMobiles(mobiles);
       repo.saveStudent(entity);*/

       //Student get

      StudentEntity studentEntity=repo.getStudent(3);
      System.out.println(studentEntity.toString());
      studentEntity.setNic("7809541326V");
      studentEntity.getName().setFirstName("updated first name");

      repo.updateStudent(studentEntity);
      studentEntity=repo.getStudent(3);
      System.out.println(studentEntity.toString());
      repo.deleteStudent(studentEntity);




    }
}
