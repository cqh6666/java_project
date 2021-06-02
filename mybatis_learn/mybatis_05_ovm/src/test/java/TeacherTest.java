import com.haige.dao.TeacherMapper;
import com.haige.pojo.Teacher;
import com.haige.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @className: PACKAGE_NAME-> TeacherTest
 * @description:
 * @author: cqh
 * @createDate: 2021-06-01 19:32
 * @version: 1.0
 * @todo:
 */
public class TeacherTest {
    @Test
    public void test(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacherById = mapper.getTeacherById(1);
        System.out.println(teacherById);

    }
}
