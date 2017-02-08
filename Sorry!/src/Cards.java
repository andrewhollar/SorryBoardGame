import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class Cards extends Application {
@Override // Override the start method in the Application class
public void start(Stage primaryStage) {
	
	Pane pane = new GridPane();
	pane.setPadding(new Insets(5, 5, 5, 5));
	Image image =  new Image("flat_lines.jpg", 1000, 1000, false, false);
	pane.getChildren().add(new ImageView(image));
	
	
	Scene scene = new Scene(pane);
	primaryStage.setTitle("Board");
	primaryStage.setScene(scene);
	primaryStage.setResizable(false);
	primaryStage.setMaxWidth(1200);
	primaryStage.setMaxHeight(1050);
	primaryStage.show();
	
	ImageView imageView2 = new ImageView(image);
	pane.getChildren().add(imageView2);
	
	// make this button appear every time someone starts a turn
	Button card = new Button("Draw a card");
	StackPane pane2 = new StackPane();
	pane2.getChildren().add(card);
	Scene scene2 = new Scene(pane2, 200, 50);
	Stage stage = new Stage();
	stage.setTitle("Draw a Card");
	stage.setScene(scene2);
	stage.show();
	
	card.setOnAction((event) -> {
	    cardDisplay();
	});

}
public static String cardPicker() {
	int randomCard = (int) (Math.random() * 10);
	int otherThanOne = 0;
	String showCard = "";
	
	
	if(randomCard == 0) {
		showCard = "1";
	}
	else if(randomCard > 0){
		otherThanOne = (int)(Math.random() * 10);
		switch (otherThanOne) {
		case 0: showCard = "2"; break;
		case 1: showCard = "3"; break;
		case 2: showCard = "4"; break;
		case 3: showCard = "5"; break;
		case 4: showCard = "7"; break;
		case 5: showCard = "8"; break;
		case 6: showCard = "10"; break;
		case 7: showCard = "11"; break;
		case 8: showCard = "12"; break;
		case 9: showCard = "Sorry!"; break;
		}
	}
	return showCard;
	
	/* 5/45 chance that we draw a 1
	 * 4/45 chance that we draw a 2
	 * 4/45 chance that we draw a 3
	 * 4/45 chance that we draw a 4
	 * 4/45 chance that we draw a 5
	 * 4/45 chance that we draw a 7
	 * 4/45 chance that we draw a 8
	 * 4/45 chance that we draw a 10
	 * 4/45 chance that we draw a 11
	 * 4/45 chance that we draw a 12
	 * 4/45 chance that we draw a sorry!
	 */
	
}

public static void cardDisplay() {
	switch(cardPicker()) {
	
		case "1": 	
			Pane pane = new StackPane();
			pane.setPadding(new Insets(5, 5, 5, 5));
			Image image = new Image("https://scontent-sea1-1.xx.fbcdn.net/v/t1.0-9/13332709_1632693327050983_1099699978544856802_n.jpg?oh=7397bc4dc730d58f54fb45d184f50fe8&oe=57D31FB2");
			pane.getChildren().add(new ImageView(image));
			
			Scene scene1 = new Scene(pane);
			Stage stage1 = new Stage();
			stage1.setTitle("You drew a 1");
			stage1.setResizable(false);
			stage1.setScene(scene1);
			stage1.show();
			
			ImageView imageView1 = new ImageView(image);
			pane.getChildren().add(imageView1);
			break;

		case "2": 
			Pane pane2 = new StackPane();
			pane2.setPadding(new Insets(5, 5, 5, 5));
			Image image2 =  new Image("https://scontent-sea1-1.xx.fbcdn.net/v/t1.0-9/13339449_1632693323717650_6492936039582823308_n.jpg?oh=cbac7230a19af45ee79506481fd7df2c&oe=580B54F7");
			pane2.getChildren().add(new ImageView(image2));
			
			Scene scene2 = new Scene(pane2);
			Stage stage2 = new Stage();
			stage2.setTitle("You drew a 2");
			stage2.setResizable(false);
			stage2.setScene(scene2);
			stage2.show();
			
			ImageView imageView2 = new ImageView(image2);
			pane2.getChildren().add(imageView2);
			break;
			
		case "3": 			
			Pane pane3 = new StackPane();
			pane3.setPadding(new Insets(5, 5, 5, 5));
			Image image3 =  new Image("https://scontent-sea1-1.xx.fbcdn.net/v/t1.0-9/13428630_1632693330384316_5432643112230803224_n.jpg?oh=94a3863b4741c3a3a2d91248fc005c77&oe=57D345FF");
			pane3.getChildren().add(new ImageView(image3));
			
			Scene scene3 = new Scene(pane3);
			Stage stage3 = new Stage();
			stage3.setTitle("You drew a 3");
			stage3.setResizable(false);
			stage3.setScene(scene3);
			stage3.show();
			
			ImageView imageView3 = new ImageView(image3);
			pane3.getChildren().add(imageView3);
			break;
			
		case "4": 	
			Pane pane4 = new StackPane();
			pane4.setPadding(new Insets(5, 5, 5, 5));
			Image image4 =  new Image("https://scontent-sea1-1.xx.fbcdn.net/v/t1.0-9/13339604_1632693347050981_6367549153945791240_n.jpg?oh=0c9da89965dfeb6d8bf5944e93bad3ff&oe=57CBFDFA");
			pane4.getChildren().add(new ImageView(image4));
			
			Scene scene4 = new Scene(pane4);
			Stage stage4 = new Stage();
			stage4.setTitle("You drew a 4");
			stage4.setResizable(false);
			stage4.setScene(scene4);
			stage4.show();
			
			ImageView imageView4 = new ImageView(image4);
			pane4.getChildren().add(imageView4);
			break;
		
		case "5":
			Pane pane5 = new StackPane();
			pane5.setPadding(new Insets(5, 5, 5, 5));
			Image image5 =  new Image("https://scontent-sea1-1.xx.fbcdn.net/v/t1.0-9/13417601_1632693350384314_5469848141197767545_n.jpg?oh=b25186c4052cef48c91610d66729c014&oe=57C56167");
			pane5.getChildren().add(new ImageView(image5));
			
			Scene scene5 = new Scene(pane5);
			Stage stage5 = new Stage();
			stage5.setTitle("You drew a 5");
			stage5.setResizable(false);
			stage5.setScene(scene5);
			stage5.show();
			
			ImageView imageView5 = new ImageView(image5);
			pane5.getChildren().add(imageView5);
			break;
			
		case "7":
			Pane pane7 = new StackPane();
			pane7.setPadding(new Insets(5, 5, 5, 5));
			Image image7 =  new Image("https://scontent-sea1-1.xx.fbcdn.net/v/t1.0-9/13343069_1632693357050980_7744722217185258747_n.jpg?oh=5566b4daec43673ea4d3d96fb6f0a12d&oe=57C24563");
			pane7.getChildren().add(new ImageView(image7));
			
			Scene scene7 = new Scene(pane7);
			Stage stage7 = new Stage();
			stage7.setTitle("You drew a 7");
			stage7.setResizable(false);
			stage7.setScene(scene7);
			stage7.show();
			
			ImageView imageView7 = new ImageView(image7);
			pane7.getChildren().add(imageView7);
			break;
		
		case "8": 
			Pane pane8 = new StackPane();
			pane8.setPadding(new Insets(5, 5, 5, 5));
			Image image8 =  new Image("https://scontent-sea1-1.xx.fbcdn.net/v/t1.0-9/13346710_1632693370384312_4257114783308875596_n.jpg?oh=39b68b93eb76d7f8c357541d70fc438a&oe=58077CA3");
			pane8.getChildren().add(new ImageView(image8));
			
			Scene scene8 = new Scene(pane8);
			Stage stage8 = new Stage();
			stage8.setTitle("You drew a 8");
			stage8.setResizable(false);
			stage8.setScene(scene8);
			stage8.show();
			
			ImageView imageView8 = new ImageView(image8);
			pane8.getChildren().add(imageView8);
			break;
		
		case "10":
			Pane pane10 = new StackPane();
			pane10.setPadding(new Insets(5, 5, 5, 5));
			Image image10 =  new Image("https://scontent-sea1-1.xx.fbcdn.net/v/t1.0-9/13417608_1632693373717645_660968524492076737_n.jpg?oh=c6f861de59e50cdcebeafa924a651df6&oe=57D5510C");
			pane10.getChildren().add(new ImageView(image10));
			
			Scene scene10 = new Scene(pane10);
			Stage stage10 = new Stage();
			stage10.setTitle("You drew a 10");
			stage10.setResizable(false);
			stage10.setScene(scene10);
			stage10.show();
			
			ImageView imageView10 = new ImageView(image10);
			pane10.getChildren().add(imageView10);
			break;
			
		case "11": 		
			Pane pane11 = new StackPane();
			pane11.setPadding(new Insets(5, 5, 5, 5));
			Image image11 =  new Image("https://scontent-sea1-1.xx.fbcdn.net/v/t1.0-9/13407068_1632693380384311_7306123320298245134_n.jpg?oh=710ab1924c866bf0f4378d604c4bf06a&oe=58030788");
			pane11.getChildren().add(new ImageView(image11));
			
			Scene scene11 = new Scene(pane11);
			Stage stage11 = new Stage();
			stage11.setTitle("You drew a 11");
			stage11.setResizable(false);
			stage11.setScene(scene11);
			stage11.show();
			
			ImageView imageView11 = new ImageView(image11);
			pane11.getChildren().add(imageView11);
			break;
		
		case "12": 
			Pane pane12 = new StackPane();
			pane12.setPadding(new Insets(5, 5, 5, 5));
			Image image12 =  new Image("https://scontent-sea1-1.xx.fbcdn.net/v/t1.0-9/13417668_1632693393717643_5744786156005475155_n.jpg?oh=706d127a9f02f5789782ab39b0553ace&oe=58077F2B");
			pane12.getChildren().add(new ImageView(image12));
			
			Scene scene12 = new Scene(pane12);
			Stage stage12 = new Stage();
			stage12.setTitle("You drew a 12");
			stage12.setResizable(false);
			stage12.setScene(scene12);
			stage12.show();
			
			ImageView imageView12 = new ImageView(image12);
			pane12.getChildren().add(imageView12);
			break;
		
		case "Sorry!": 
			Pane paneSorry = new StackPane();
			paneSorry.setPadding(new Insets(5, 5, 5, 5));
			Image imageSorry =  new Image("https://scontent-sea1-1.xx.fbcdn.net/v/t1.0-9/13423859_1632693403717642_4879906023677692016_n.jpg?oh=3e89ef3aac1faadcb092fd98591fcf8d&oe=57D70F58");
			paneSorry.getChildren().add(new ImageView(imageSorry));
			
			Scene sceneSorry = new Scene(paneSorry);
			Stage stageSorry = new Stage();
			stageSorry.setTitle("Sorry card");
			stageSorry.setResizable(false);
			stageSorry.setScene(sceneSorry);
			stageSorry.show();
			
			ImageView imageViewSorry = new ImageView(imageSorry);
			paneSorry.getChildren().add(imageViewSorry);
			break;
		
	}
}
public static void main(String[] args){
	Application.launch(args);


		
		
	}
}
