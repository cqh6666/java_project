import com.haige.dao.StudentMapper;
import com.haige.dao.TeacherMapper;
import com.haige.pojo.Student;
import com.haige.pojo.Teacher;
import com.haige.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @className: PACKAGE_NAME-> TeacherTest
 * @description:
 * @author: cqh
 * @createDate: 2021-06-01 16:13
 * @version: 1.0
 * @todo:
 */
public class TeacherTest {
    @Test
    public void testTeacher(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher();
        System.out.println(teacher);


        sqlSession.close();
    }

    @Test
    public void testStudentTeacher(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = mapper.getStudent();

        for (Student student : studentList) {
            System.out.println(student);
        }

        sqlSession.close();
    }

    @Test
    public void testStudentTeacher2(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = mapper.getStudent2();

        for (Student student : studentList) {
            System.out.println(student);
        }

        sqlSession.close();
    }
}
