import java.util.Scanner;
public class NokiaPhone{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
 
System.out.println(""" 

Welcome to Nokia02  Simplicity with style

********************MENU FUNCTIONS********************

1  Phone book
2  Messages
3  Chat
4  Call register
5  Tones
6  Settings
7  Call divert
8  Music;
9  Games;
10 Calculator
11 Reminders
12 Clock
13 Profiles
14 Services
15 SIM services

""");




System.out.print("Select a number from the options above: ");
int selection = input.nextInt();

switch(selection){
	case 1: 
		System.out.println("Phone book");
		System.out.println("""
		1.Search
		2.Service Nos
		3.Add name
		4.Erase
		5.Edit
		6.Copy
		7.Assign tone
		8.Send b'card
		9.options
		10.Speed dials
		11.Voice tags
		""");
		System.out.println("Welcome to phone book\nSelect a number between 1 to 11: ");
		int choice = input.nextInt();

			switch(choice){

			case 1: 
				System.out.print("Search");
			break;
			case 2:
				System.out.print("Service Nos");
			break;
			case 3:
				System.out.print("Add name");
			break;
			case 4:
				System.out.print("Erase");
			break;
		        case 5:
			 	System.out.print("Edit");
			break;
			case 6:
				System.out.print("Copy");
			break;
			case 7:
				System.out.print("Assign Tone");
			break;
			case 8:
				System.out.println("Send b'card");
			break;
			case 9:
				System.out.println("Options");
				System.out.println("""
				1.Memory in use
				2.Type of view
				3.Memory status
				""");

				System.out.println("Enter number between 1 to 3: ");
				int number = input.nextInt();
					switch(number){
						case 1:
							System.out.print("Memory in use");

						break;
						case 2: 
							System.out.print("Type of view");
						break;

						case 3:
							System.out.print("Memory status");
						break;
						}

			
			}
			break;

	case 2:
		System.out.println("Messages");
		System.out.println("""
		1.Write messages
		2.Inbox
		3.Outbox
		4.Picture messages
		5.Templates
		6.Smileys
		7.Message settings
		8.Info service
		9.Voice mailbox number
		10.Service command editor
		""");
		System.out.print("Welcome to Messages\n Select a number between 1 to 10: ");
		int response= input.nextInt();

			switch(response){

			case 1: 
				System.out.print("Write messages");
			break;
			case 2:
				System.out.print("Inbox");
			break;
			case 3:
				System.out.print("outbox");
			break;
			case 4:
				System.out.print("Picture messages");
			break;
		        case 5:
			 	System.out.print("Templates");
			break;
			case 6:
				System.out.print("Smileys");
			break;
			case 7:
				System.out.println("Message Settings");
				System.out.println("""
				1.Set 12
				2.Common
				""");
				System.out.println("Choose 1 or 2: ");
				int action = input.nextInt();
					switch(action){
						case 1:
							System.out.println("Set 12");
							System.out.println("""
							1.Message center number
							2.Message sent as
							3.Message validity
							""");

							System.out.println("Enter any between 1 to 3: ");
							int opinion = input.nextInt();
								switch(opinion){
									case 1:
										System.out.print("Message centre number");
									break;
									case 2:
										System.out.print("Message sent as");
									break;
									case 3:
										System.out.print("Message Validity");
									break;
										}
						break;
						case 2:
							System.out.println("Common ");
							System.out.println("""
							1.Deliver reports
							2.Reply via same centre
							3.Character support
							""");
							System.out.println("Enter any number between 1 to 3: ");
							int decision = input.nextInt();
								switch(decision){
									case 1:
										System.out.print("Delivery Reports");
									break;
									case 2:
										System.out.print("Reply via same centre");
									break;
									case 3:
										System.out.print("Character support");
									break;
										}


							}


				break;
				case 8:
					System.out.print("Info service");
				break;
				case 9:
					System.out.print("Voice mailbox number");
				break;
				case 10:
					System.out.print("Service command editor");
				break;

				
		}
				

	break;
	
	case 3:
		System.out.print("Chat");
	break;
	case 4:
		System.out.println("Call register");
		System.out.println("""
		1.Missed calls
		2.Recieved calls
		3.Dialled numbers
		4.Erase rececent call lists
		5.Show call duration
		6.Show call costs
		7.Call cost settings
		8.Prepaid credit
		""");
		System.out.print("This is your personal call register\n Select any number between 1 to 8: ");
		int entry = input.nextInt();
			switch(entry){
				case 1:
					System.out.print("Missed calls");
				break;
				case 2:
					System.out.print("Recieved calls");
				break;
				case 3:
					System.out.print("Dialled numbers");
				break;
				case 4:
					System.out.print("Erase recent call lists");
				break;
				case 5:
					System.out.println("Show call duration");
					System.out.println("""
					1.Last call duration
					2.All calls' duration
					3.Recieved calls' duration
					4.Dialled calls'duration
					5.Clear timers
					""");
					System.out.print("Enter any number between 1 to 5: ");
					int prompt = input.nextInt();
						switch(prompt){
							case 1:
								System.out.print("Last call duration");
							break;
							case 2:
								System.out.print("All calls' duration");
							break;
							case 3:
								System.out.print("Recieved calls' duration");
							break;
							case 4:
								System.out.print("Dialled calls' duration");
							break;
							case 5:
								System.out.print("Clear timers");
							break;

							
								}
				break;
				case 6:
					System.out.println("Show call cost");
					System.out.println("""
					1.Last call cost
					2.All calls'cost
					3.Clear counters
					""");
					System.out.println("Enter any number between 1 to 3: ");
					int answer = input.nextInt();
						switch(answer){
							case 1: 
								System.out.print("Last call cost");
							break;
							case 2:
								System.out.print("All calls' cost");
							break;
							case 3:
								System.out.print("Clear counters");
							break;
							
								}

				break;
				case 7:
					System.out.println("Call cost setting");
					System.out.println("""
					1. Call cost limit
					2.Show costs in
					""");
					System.out.println("Enter 1 or 2: ");
					int reply = input.nextInt();
						switch(reply){
							case 1:
								System.out.print("Call cost limit");
							break;
							case 2:
								System.out.print("Show costs in");
							break;

							     }
				break;
				case 8:
					System.out.print("Prepaid credit");
				break;
				
			}





	break;
	case 5:
		System.out.println("Tones");
		System.out.println("""
		1.Ringing tone
		2.Ringing volume
		3.Incoming call alert
		4.Message alert tone
		5.Keypad tones
		6.Warning tones
		7.Vibrating alert
		8.Screen saver
		""");
		
		System.out.println("Enter any number between 1 to 8: ");
		int preference = input.nextInt();
			switch(preference){
				case 1: 
					System.out.print("Ringing tone");
				break;
				case 2:
					System.out.print("Ringing volume");
				break;
				case 3:
					System.out.print("Incoming call alert");
				break;
				case 4:
					System.out.print("Message alert tone");
				break;
				case 5:
					System.out.print("Keypad tones");
				break;
				case 6:
					System.out.print("Warning tones");
				break;
				case 7:
					System.out.print("Vibrating alert");
				break;
				case 8:
					System.out.print("Screen saver");
				break;
					}

	break;
	case 6:
		System.out.println("Settings");
		System.out.println("""
		1.Call settings
		2.Phone settings
		3.Security settings
		4.Restore factory settings
		""");
		
		System.out.println("Enter any number between 1 to 4");
		int paths = input.nextInt();
			switch(paths){
				case 1:
					System.out.println("Call settings");
					System.out.println("""
					1.Automatic redial
					2.Speed dialling
					3.Call waiting option
					4.Own number sending
					5.Phone line in use
					6.Automatic answer
					""");
					System.out.println("Enter any number between 1 to 6");
					int statement = input.nextInt();
						switch(statement){
							case 1:
								System.out.print("Automatic redial");
							break;
							case 2:
								System.out.print("Speed dialling");
							break;
							case 3:
								System.out.print("Call waiting option");
							break;
							case 4:
								System.out.print("Own number sending");
							break;
							case 5:
								System.out.print("Phone line in use");
							break;
							case 6:
								System.out.print("Automatic answer");
							break;

							
				

								}
					
				break;
				case 2:
					System.out.println("Phone settings");
					System.out.println("""
					1.Language
					2.Cell info display
					3.Welcome note
					4.Network selection
					5.Confirm SIM service actions
					""");
					System.out.println("Enter any number between 1 to 6");
					int value = input.nextInt();
						switch(value){
							case 1:
								System.out.print("Language");
							break;
							case 2:
								System.out.print("Cell info display");
							break;
							case 3:
								System.out.print("Welcome note");
							break;
							case 4:
								System.out.print("Network selection");
							break;
							case 5:
								System.out.print("Confirm SIM service actions");
							break;
							
								}

				break;
				case 3:
					System.out.println("Security settings");
					System.out.println("""
					1.Pin code request
					2.Call barring service
					3.Fixed dialling
					4.Closed user group
					5.Security level
					6.Change access codes
					""");
					System.out.println("Enter any number between 1 to 6");
					int data = input.nextInt();
						switch(data){
							case 1:
								System.out.print("Pin code request");
							break;
							case 2:
								System.out.print("Call barring service");
							break;
							case 3:
								System.out.print("Fixed dialling");
							break;
							case 4:
								System.out.print("Closed user group");
							break;
							case 5:
								System.out.print("Security level");
							break;
							case 6:
								System.out.print("Change access codes");
							break;
							
								}



				break;
				case 4:
					System.out.print("Restore factory settings");
				break;
					}




	break;
	case 7: 
		System.out.print("Call divert");
	break;
	case 8:
		System.out.println("Music");
		System.out.println("""
		1.Music player
		2.Radio
		3.Recorder
		4.Track list
		""");
		System.out.println("This is just for you\n Select any number between 1 to 4: ");
		int taste = input.nextInt();
			switch(taste){
				case 1:
					System.out.print("Music player");
				break;
				case 2:
					System.out.print("Radio");
				break;
				case 3:
					System.out.print("Recorder");
				break;
				case 4:
					System.out.print("Track list");
				break;
				}

	break;
	case 9:
		System.out.print("Games");
	break;
	case 10:
		System.out.print("Calculator");
	break;
	case 11:
		System.out.print("Reminders");
	break;
	case 12:
		System.out.println("Clock");
		System.out.println("""
		1.Alarm clock
		2.Clock settings
		3.Date setting
		4.Stopwatch
		5.Countdown timer
		6.Auto update of date and time
		""");
		System.out.println("TickToc , check your time\n Select any number between 1 to 6: ");
		int decide = input.nextInt();
			switch(decide){
				case 1:
					System.out.print("Alarm clock");
				break;
				case 2:
					System.out.print("Clock settings");
				break;
				case 3:
					System.out.print("Date setting");
				break;
				case 4:
					System.out.print("Stopwatch");
				break;
				case 5:
					System.out.print("Countdown timer");
				break;
				case 6:
					System.out.print("Auto update of date and time");
				break;
					}
		
	break;
	case 13:
		System.out.print("Profiles");
	break;
	case 14:
		System.out.print("Services");
	break;
	case 15:
		System.out.print("Sim Services");
	break;

	}
		



	
}
}
