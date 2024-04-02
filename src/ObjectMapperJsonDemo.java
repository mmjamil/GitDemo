import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.File;
public class ObjectMapperJsonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectMapper objectmapper = new ObjectMapper();
		
		String input="{\"name\":\"john\",\"city\":\"palo alto\",\"department\":\"EAS\",\"designation\":\"manager\"}";
		
		ObjectMapperTest obj= new ObjectMapperTest();
		
		objectmapper.readValue(input, ObjectMapperTest.class);
		
	}

}
