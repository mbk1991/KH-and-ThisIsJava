package test.test.test;

import java.util.regex.Pattern;

public class GitHubImgParsing {
	

	public static void main(String[] args) {

		
		String result = getImgTag(
				"Welcome to the AVBProject wiki!\r\n" + 
				"![votiIng](https://user-images.githubusercontent.com/99261591/195728372-3346ecb9-d2bd-4ba5-ac2e-4fa5cc04ba36.png)\r\n" + 
				"![enroll](https://user-images.githubusercontent.com/99261591/195728374-d0f9631b-c182-4893-9aa6-78c61b62edde.png)\r\n" + 
				"![enroll2](https://user-images.githubusercontent.com/99261591/195728376-ad409a87-ead1-45ef-9f51-35102e5e71fb.png)\r\n" + 
				"![enroll3](https://user-images.githubusercontent.com/99261591/195728382-6181ff24-d01c-42fa-8d7a-5e72b57ff538.png)\r\n" + 
				"![enroll4](https://user-images.githubusercontent.com/99261591/195728384-403b77e4-553e-48f9-99f3-a74e5e67ce5c.png)\r\n" + 
				"![listFilter1](https://user-images.githubusercontent.com/99261591/195728385-bd70fdda-f146-41de-89e7-76edb77dd616.png)\r\n" + 
				"![login](https://user-images.githubusercontent.com/99261591/195728386-47c4b28f-ec67-494e-bf14-f0c4599d921b.png)\r\n" + 
				"![nick1](https://user-images.githubusercontent.com/99261591/195728389-3e82a76d-dd76-482c-9f8e-a67d56ea9cc1.png)\r\n" + 
				"![nick2](https://user-images.githubusercontent.com/99261591/195728392-b2bb2cf8-6b7e-4302-8970-51e9115f2259.png)\r\n" + 
				"![nick3](https://user-images.githubusercontent.com/99261591/195728394-1ddd3d3d-f692-425a-809b-9c1c58d5bae4.png)\r\n" + 
				"![nick4](https://user-images.githubusercontent.com/99261591/195728397-3fa66a42-2dd9-46bb-90aa-0f87462fd960.png)\r\n" + 
				"![nick5](https://user-images.githubusercontent.com/99261591/195728398-73190657-14a3-40ef-b3f8-56ed6c4b846e.png)\r\n" + 
				"![voteComplete](https://user-images.githubusercontent.com/99261591/195728399-f109c5d6-80ac-414e-a41e-f06c37fe08a6.png)\r\n" + 
				"![voteList](https://user-images.githubusercontent.com/99261591/195728401-e0cfe6aa-7fdd-4570-a3af-6e5a343e8b6b.png)\r\n" + 
				"![voteMine](https://user-images.githubusercontent.com/99261591/195728402-cfe47a7b-1f52-4470-9cee-6a9136416d8a.png)\r\n" + 
				"![voteRegister](https://user-images.githubusercontent.com/99261591/195728403-04d499bb-b3c0-4402-aa7f-606f1d388012.png)"
				
				);
		
		
		
	}
	
	public static String getImgTag(String targetStr) {
		
		
		String reseult = "";
		String[] splitTarget = targetStr.split("(");
		String regEx = "^(https)[0-9a-zA-Z\\/\\-\\_\\.]*(png)$";
		
		for(int i=0; i<splitTarget.length; i++) {
			if(Pattern.matches(regEx, splitTarget[i])) {
				System.out.println(splitTarget[i]);
			}
		}
		
		
		return "";
	}
	
}
