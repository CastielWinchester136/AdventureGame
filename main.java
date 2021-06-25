import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    boolean done = false;
    int roomNum = 1;

    System.out.println("'Welcome to prison. I'm Bond-' he introduces but you cut him off 'James Bond' you interject. Mr. Bond gives a shy smile. 'Yes I am highly well known but there is no need to make a mockery of my title' You let out a little giggle. 'Well anyway' James Bond continues, he points at a room that is bared off reveiling a single bed and a toilet. You look towards Mr. Bond a give a questionalble look. He sees the disgust on your face and he gives a slight chuckle and smile. He gestures to the door of the cell and you step in, he opens the door for you and you being a refined villain nod for his thanks. 'I am here to moniter you for the first day. If you have questions, ask. If you escape we will most likely kill you.' You give a slight nod 'So be good and you won't die. Cool...' you reply. You then think to yourself 'Looks like I won't live for very long!");

    System.out.println("");

    System.out.println("You goal: Escape the villain prision. It's quite simple. Answer questions to unlock doors, and meet some fellow villains along the way! Google is allowed to be used for questions. Type 'help' to get some help or for 'extra help.'");

    System.out.println("");

    System.out.println("You better be ready because your breaking out of the most secure facility for villains.");

    while(done == false){
      System.out.print(":");
      String input =scan.nextLine();

//The beginning of the game 
      switch(roomNum){
        case 1:
          switch(input){
            case "go north":
            //send player to next destination or room 
            //Put description of the room on line 32
            P("You see a wall but no door or window or anything of use to you.");
            break;

            case "go east":
            //send player to next destination 
            P("You are at your at the observation point of your cell. The wall is made out of 5 layers of extra thick glass. James Bond left you a book in a small tray by the door. He's monititoring you on the other side of the glass. He nodds allowing you to pick up the book."); 
            roomNum = 9;
            break;

            case "go south":
            //send player to next destination   
            P("There is a wall there and no way to escape.");
            break;

            case "go west":
            //send player to next destination 
            P("Yes! You've reach another wall. James Bond looks at you weirdly...");
            break;

            case "flip off James Bond":
            P("You've successfully given the famous M16 agent 007 the finger.");
            break;

            default:
            P("As your conscience I do not understand, what you are trying to say or you can not go in that direction because there is nothing of importance for you to see. And I know that! OR you didn't type it right.");
            break;

            case "inventory":
            P("You have nothing because there is nothing that you can pick up!");
            break;

            case "help":
              P("*******Commands*******");
              P("see: Tells you the discription of the room you are in.");
              P("");
              P("get ' object': Attempt to get an object that has been described in the room");
              P("EX: get torch");
              P("");
              P("go'direction':Send your character in the specified direction if there is a path to do so.");
              P("EX: go north, northwest, northeast...");
              P("");
              P("go to 'towards named object': Send your character closer to an object.");
              P("EX: go to key pad");
              P("");
              P("open 'object': opens the named object if possible."); 
              P("EX: open door");
              P("");
              P("flip off 'character': You give the character that is around the finger and stick out your tongue.");
              P("EX: flip off James Bond");
              P("");
              P("ask 'character': asks a character that is described to talk to you."); 
              P("");
              P("inventory: yes... there is an inventory for later in the game but it won't be of much use."); 
            break;

            case "Dean":
            P("ROOM 2");
            roomNum = 2;
            break;

            case "Sam":
            P("ROOM 3");
            roomNum = 3;
            break;

            case "Jack":
            P("ROOM 4");
            roomNum = 4;
            break;

            case "Mary":
            P("ROOM 5");
            roomNum = 5;
            break;

            case "Kevin":
            P("ROOM 6");
            roomNum = 6;
            break;

            case "Gabriel":
            P("ROOM 7");
            roomNum = 7;
            break;

            //End of the game 
            case "Chuck":
            P("ROOM 8");
            roomNum = 8;
            break;

            case "Amara":
            P("ROOM 9");
            roomNum = 9;
            break;

            case "Charlie":
            P("ROOM 10");
            roomNum = 10;
            break;

            case "Ruby":
            P("ROOM 11");
            roomNum = 11;
            break;

            case "Eileen":
            P("ROOM 12");
            roomNum = 12;
            break;

            case "Benny":
            P("ROOM 13");
            roomNum = 13;
            break;

            case "Bobby":
            P("ROOM 14");
            roomNum = 14;
            break;

            case "Jo":
            P("ROOM 15");
            roomNum = 15;
            break;

            case "Crowley":
            P("ROOM 16");
            roomNum = 16;
            break;

            case "Rowena":
            P("ROOM 17");
            roomNum = 17;
            break;

            case "Garth":
            P("ROOM 18");
            roomNum = 18;
            break;

            case "Henry":
            P("ROOM 19");
            roomNum = 19;
            break;

            case "Cas":
            P("ROOM 20");
            roomNum = 20;
            break;
          }
        break;

//Getting the book to retrieve the codes 
        case 9:
          switch(input){
            case "get book":
            P("You have successfully used your functioning digits on your hands to pick up a stitched together pack of paper.");
            break;

            case "open book":
            P("You have finally opened the book to show a sequence of numbers. You look up to see how you were locked in your cell and by magical purposes there by your door is a keypad, both inside and outside your cell. The keypad is in the southeast corner of the room. The numbers are 3262005");
            roomNum =11;  
            break;

          case "inventory":
            P("you have a book...");
            break;

          case "help":
              P("*******Commands*******");
              P("see: Tells you the discription of the room you are in.");
              P("");
              P("get ' object': Attempt to get an object that has been described in the room");
              P("EX: get torch");
              P("");
              P("go'direction':Send your character in the specified direction if there is a path to do so.");
              P("EX: go north, northwest, northeast...");
              P("");
              P("go to 'towards named object': Send your character closer to an object.");
              P("EX: go to key pad");
              P("");
              P("open 'object': opens the named object if possible."); 
              P("EX: open door");
              P("");
              P("flip off 'character': You give the character that is around the finger and stick out your tongue.");
              P("EX: flip off James Bond");
              P("");
              P("ask 'character': asks a character that is described to talk to you."); 
            break;

            default:
            P("I'm sorry that you don't understand. But your understanding is affecting my understanding.");
            break;
          }
        break;

//Talking to James Bond giving him the book
        case 11:
          switch(input){
          
            case "go southeast":
            P("James Bond looks at you as you stare down the keypad and look back inside the book to see the 7-digit code to the door. You're smart enough to know that the numbers are the dates when the New Doctor Who series first aired but you aren't quite smart enough to think of a clever distraction to use on the agent. Remembering the number was the easy part. Trying to eat the piece of paper with the number on it with out causing suspision was a little more difficult. You place the book back onto the tray after 'surveying' the books contents. James Bond looks at the book that you have placed back on the tray. 'It's not my type of book' you say giving a slight head tilt. James Bond rolles his eyes he goes to pick up the book 'Shakespeare! Really. How can this not be your type?' He said in a jokeingly sarcastic monotone voice. 'I prefer young adult fiction.'He takes the book and walks off. Down the hall he yells 'Don't do anything stupid until I get back.' and of course you have to reply with the iconic line from Captian America 'How can I you're taking all the stupid with you' You don't think he got it but he did. Now you have time to enter the key code. Don't forget to go to the keypad first. Or you will just be poking at air...");
            roomNum = 10;
            break;

            case "inventory":
            P("you have a book.........");
            break;

            case "help":
              P("*******Commands*******");
              P("see: Tells you the discription of the room you are in.");
              P("");
              P("get ' object': Attempt to get an object that has been described in the room");
              P("EX: get torch");
              P("");
              P("go'direction':Send your character in the specified direction if there is a path to do so.");
              P("EX: go north, northwest, northeast...");
              P("");
              P("go to 'towards named object': Send your character closer to an object.");
              P("EX: go to key pad");
              P("");
              P("open 'object': opens the named object if possible."); 
              P("EX: open door");
              P("");
              P("flip off 'character': You give the character that is around the finger and stick out your tongue.");
              P("EX: flip off James Bond");
              P("");
              P("ask 'character': asks a character that is described to talk to you."); 
            break;

          }
          break;

//Opening the keypad that leads out of the cell
          case 10:
          switch(input){
            case "go to key pad":
            P("You reach the key pad its only in pictures of Doctor Who Doctors. Being the Nerdy self you are you know who is who and the code is easy.");
            P("");
            P("Hartnell: 1");
            P("Troughton: 2");
            P("Pertwee: 3");
            P("Baker: 4");
            P("Davison: 5");
            P("Baker: 6");
            P("Hartnell: 7");
            P("McCoy: 8");
            P("McGann: 9");
            P("Hurt: 0");
            P("");
            P("EX: Hurt, T.Baker, Davison, Hartnell, Pertwee = 94513");
            break;

            case "go to keypad":
            P("You reach the key pad its only in pictures of Doctor Who Doctors. Being the Nerdy self you are you know who is who and the code is easy. But take your time typing it out. :)");
            P("");
            P("Hartnell: 1");
            P("Troughton: 2");
            P("Pertwee: 3");
            P("T.Baker: 4");
            P("Davison: 5");
            P("C.Baker: 6");
            P("McCoy: 7");
            P("McGann: 8");
            P("Hurt: 9");
            P("Eccleston: 0");
            P("");
            P("EX: Hurt, T.Baker, Davison, Hartnell, Pertwee = 94513");
            P("");
            P("its very specific... One mess won't work...");
            break;

            case "Pertwee, Troughton, C.Baker, Troughton, Eccleston, Eccleston, Davison":
            P("You have successfully unlocked the door. You push the door open slowly. The hinges slide with ease and you step out of the room. Well that cell didn't hold you for that long. You look back at the prestine glass that was supposed to encase you but you smirk and stand in the middle of the hallway. You make it out into the hallway. The hallways goes to the north and the south.");
            roomNum =2;
            break;

            case "see":
            P("You see the wonderful abyss of prison. Happy?");
            break;
            
            case "help":
              P("*******Commands*******");
              P("see: Tells you the discription of the room you are in.");
              P("");
              P("get ' object': Attempt to get an object that has been described in the room");
              P("EX: get torch");
              P("");
              P("go'direction':Send your character in the specified direction if there is a path to do so.");
              P("EX: go north, northwest, northeast...");
              P("");
              P("go to 'towards named object': Send your character closer to an object.");
              P("EX: go to key pad");
              P("");
              P("open 'object': opens the named object if possible."); 
              P("EX: open door");
              P("");
              P("flip off 'character': You give the character that is around the finger and stick out your tongue.");
              P("EX: flip off James Bond");
              P("");
              P("ask 'character': asks a character that is described to talk to you."); 
            break;

            default:
            P("As your conscience I do not understand, what you are trying to say or you can not go in that direction because there is nothing of importance for you to see. And I know that! OR you didn't type it right.");
            break;

            case "inventory":
            P("You had a book but you gave it back and no longer have anything with you. Your clothes don't have any pockets in them... There is really no space for an inventory");
            break;
          }
        break;

//Walking down the north or south hallways 
      case 2:
           switch(input){
            case "go north":
            P("You walk up the hallway up north and walk for an extremly long time. But you eventually reach another room. It's got another keypad on it, probably with a different code, but you don't plan on freeing anybody else. There's a small window to see who's inside. You hear some machine that sounds like it's breathing and are curious to see what it is so you stand on your tippy-toes, because you a smol bean, and take a look.");
            roomNum =3;
            break;

            case "go east":
            P("There is a wall there dummy...");
            break;

            case "go south":
            P("You walk down the hallway down south and walk for an extremly excrutiating amount of time but you see a tiny little door at the end. You've almost reach the door but you here foot steps coming your way. There's a small crevice in the wall, thankfully, but your legs feel stuck and can't remember how to move.");
            break;

            case "go to crevice":
            P("You move your feet, finally, to hide. You being a small unditectable person are able to hide in the shadows better than Batman. You here the footsteps grow nearer and but it's just Ant-Man. You think about what to do now as Ant-Man walks away. You could... flip him off... or just stay quite like a good little villain. Please type 'stay quite' -_-");
            break;
            
            case "stay quite":
            P("You've successfully stayed quite and did not get caught. Good for you! :) You turn around in your little corner feeling a small door knob. It's locked, of course, but somebody hears you rattle the door knob and slides a piece of paper under the door. There is small peep hole in the door so the person inside saw you. You take the piece of paper. It says: 'Hail Hydra!' You're very confused because you have had a few run-ins with Red Skull back in the day and you kind of owe him some stuff, so you're kind of scared to open the door but breaking somebody out of jail is a good favour! right? You turn to see a a keyboard and a small screen you look at the screen as it lights up. A question pops up: Which infinity stone does Red Skull protect on the planet of Vermir? HINT: It's one of the six infinity stones. ;)");
            break;
            
            case "soul stone":
            P("You enter in the correct code and the door swings open to reveal a large office space. There are two chairs facing each other, a desk in the center of the room, a head of a deer at the end of the room and shelves of books. Lots of books. You hear a silent fire cackle in the back room of the office space. There's a door that leads to somewhere in the northwest corner of the room, and in the back area of the room you hear chatter echoing throughout the hollow walls.");
            roomNum =4;
            break; 

            case "Soul Stone":
            P("You enter in the correct code and the door swings open to reveal a large office space. There are two chairs facing each other, a desk in the center of the room, a head of a deer at the end of the room and shelves of books. Lots of books. You hear a silent fire cackle in the back room of the office space. There's a door that leads to somewhere in the northwest corner of the room, and in the back area of the room you hear chatter echoing throughout the hollow walls.");
            roomNum =4;
            break; 

            case "go west":
            P("You really want to go back to your cell...?");
            break;

            case "flip off Ant-Man":
            P("You flipped off Ant-Man. WHY!? You were hidden and now just exposed yourself. Ant-Man calls his fellow Avenger buddied to signal that you have gotten out. They put you in the most secure room of the whole building. And James Bond is the one who's supposed to baby sit you. Again!");
            roomNum =5;
            break;

            case "see":
            P("It's a hallway that is grey. You are in white clothes and have just gotten out of your cell in villain jail. I suggest you stop looking and start moving those feet!");
            break; 

            case "help":
              P("*******Commands*******");
              P("see: Tells you the discription of the room you are in.");
              P("");
              P("get ' object': Attempt to get an object that has been described in the room");
              P("EX: get torch");
              P("");
              P("go'direction':Send your character in the specified direction if there is a path to do so.");
              P("EX: go north, northwest, northeast...");
              P("");
              P("go to 'towards named object': Send your character closer to an object.");
              P("EX: go to key pad");
              P("");
              P("open 'object': opens the named object if possible."); 
              P("EX: open door");
              P("");
              P("flip off 'character': You give the character that is around the finger and stick out your tongue.");
              P("EX: flip off James Bond");
              P("");
              P("ask 'character': asks a character that is described to talk to you."); 
            break;

            default:
              P("I'm afraid I don't understand!!! TRY AGAIN OR SOMETHING DIFFERENT!");
            break;

            case "inventory":
            P("You still have nothing with you. WHAT DID YOU EXPECT A MAGIC SWORD TO HELP YOU SLASH YOUR WAY THROUGH JAIL!! NO!");
            break;
          }
        break;

//Darth Vader's Room
      case 3:
           switch(input){
            case "go north":
            P("You can not enter Darth Vader's room. Because he will either force choke you or turn you in.");
            break;

            case "go east":
            P("There is another hallway east it's blocked off. Don't try to push it.");
            break;

            case "go south":
            P("You walk back down the hallway. Your cell is on the right side and the hallway goes further down south.");
            break;

            case "go west":
            P("There is a wall there and you do not have the ability to walk through wall.");
            break;

            case "see":
            P("Inside the single room sits the Dark Lord. Darth Vader. He looks weak as he sits in  a large chair being kept alive through machines. The force is strong within him but the room limits what affects you. He looks at you with the red-yellow eyes of his and you feel a searing pain in your head. You feel as if your eyes are going to fall out but he gives you 3 pictures. One of Dean Winchester, another of Castiel, and one with both of them in the photo. You are still very confused.");
            break;

            case "ask Darth Vader":
            P("'You watch Supernatural, Darth?' you ask, you laugh at your own joke. He looks like he rolled his eyes at you but you're not entirely sure. But you see the mangaled figure in the room close his eyes and trys to send you another message. You're to intregued to leave so you close your eyes too, opening your mind to the world famous Darth Vader.");
            P("");
            P("He sends you numbers this time: 15x18"); 
            P("You know what the password is. It's Castiel and Dean's ship name. You give Darth Vader a thumbs up and you know for sure he rolls his eyes this time. Guess the couple name.");
            P("HINT: Dean + Castiel.  Also don't forget to go to the keypad first...");
            break;

            case "go to keypad":
            P("You approach the keypad. It's a computer keyboard with a small screen. The screen opens up and it asks you to 'Enter Password Here' in a white bar underneath the written words. Type the ship name.");
            break;

            case "go to key pad":
            P("You approach the keypad. It's a computer keyboard with a small screen. The screen opens up and it asks you to 'Enter Password Here' in a white bar underneath the written words. Type the ship name.");
            break;

            case "Destiel":
            P("You have successfully figured out the all famous ship name of the weird, awfully sad TV show, that ran for 15 years and you being the geek you are watched all 15 of the seasons. You press enter but the computer asks you another question. One that only a true fan would understand. And not just a fan of the show but of the fandom works... The question is: What is the best Destiel fan fic?");
            P("");
            P("You stare at the screen blankly because there are so many good one but there is only one that is the true fanfic of them all.");
            P("");
            P("HINT: A Beatles Song. First line of the song: Well, shake it up, baby, now.");
            break;

            case "destiel":
            P("You have successfully figured out the all famous ship name of the weird, awfully sad TV show, that ran for 15 years and you being the geek you are watched all 15 of the seasons. You press enter but the computer asks you another question. One that only a true fan would understand. And not just a fan of the show but of the fandom works... The question is: What is the best Destiel fan fic?");
            P("");
            P("You stare at the screen blankly because there are so many good one but there is only one that is the true fanfic of them all.");
            P("");
            P("HINT: A Beatles Song. First line of the song: Well, shake it up, baby, now.");
            break;

            case "Twist and Shout":
            P("You think to yourself 'These are lousy passwords guys..' BUT it makes breaking out so much easier. The door to Darth Vader unlocks. He nodds his head for you to come closer towards him. You abide to the dark rulers wishes. You're vision starts to go fuzzy and your balance is very off. Next thing you know you're in a interogation room down the east hallway.");
            roomNum = 6;
            break;

            case "twist and shout":
            P("You think to yourself 'These are lousy passwords guys..' BUT it makes breaking out so much easier. The door to Darth Vader unlocks. He nodds his head for you to come closer towards him. You abide to the dark rulers wishes. You're vision starts to go fuzzy and your balance is very off. Next thing you know you're in a interogation room down the east hallway.");
            roomNum = 6;
            break;

            case "flip off Darth Vader":
              P("You feel the force of the room change around you. You suddenly feel a small choking at you throat but the Jedi in the hero congress made sure that the force doesn't work outside of the room. Darth Vader just stares at you even more intensly through his eyes.");
            break;

            case "help":
              P("*******Commands*******");
              P("see: Tells you the discription of the room you are in.");
              P("");
              P("get ' object': Attempt to get an object that has been described in the room");
              P("EX: get torch");
              P("");
              P("go'direction':Send your character in the specified direction if there is a path to do so.");
              P("EX: go north, northwest, northeast...");
              P("");
              P("go to 'towards named object': Send your character closer to an object.");
              P("EX: go to key pad");
              P("");
              P("open 'object': opens the named object if possible."); 
              P("EX: open door");
              P("");
              P("flip off 'character': You give the character that is around the finger and stick out your tongue.");
              P("EX: flip off James Bond");
              P("");
              P("ask 'character': asks a character that is described to talk to you."); 
            break;

            default:
              P("I'm afraid I don't understand or it's incorrect, sorry...");
              break;

            case "inventory":
            P("I repeat. THERE IS NOTHING IN YOU INVENTORY!");
            break;
          }
        break; 

//Hannibal Room
      case 4:
           switch(input){
            case "go north":
            P("You move to look at the deer head. It just sits there in the middle of the room. You here silent chatter between two people in the kitchen. ");
            break;

            case "go east":
            P("You move to towards the book shelves. There are two levels of books and each neatly placed in its place. But nothing else of interest. The lights hang high and the room has a cold environment to it.");
            break;

            case "go south":
            P("You skim a look at the desk. It has multiple drawings, and lots of notebooks on it. You walk further towards the chatter and noise in the the back room. You open the door and see two men cooking. You're not sure how they got to be together or how they gained access to cooking supplise but you don't ask as one of them take a dulled down butchering knife with a retractable blade to a large piece of meat that looks awefully like one human lung. Then it sinks in who's room you're in. The two men who stand before you are Hannibal Lecter and Will Graham. 'Hello. Would you like to join us for dinner?' Hannibal asks. You are very happy that they got together but kind of scared for youself, because they are... cannibals.");
            break;

            case "ask Hannibal Lecter":
            P("'Are you going to eat me' you ask is a shy little voice. Will doesn't look at you in the eyes but he smiles. 'No we will not eat you. This here is just a treat we get every week thanks to all the heros that kill those villains and have nothing to do with the bodies.' Hannibal looks over to Will, and Will looks over to Hannibal. You just look down at your feet. 'If you are looking for a way out I would suggest the southwest door, over there.' You nod yes to say that you are looking for a way out and still questioning how the heros let these guys have a full blown kitchen and a door that leads to an exit. You thank them and now you know to proceed to the southwest door."); 
            break;

            case "ask hannibal lecter":
            P("'Are you going to eat me' you ask is a shy little voice. Will doesn't look at you in the eyes but he smiles. 'No we will not eat you. This here is just a treat we get every week thanks to all the heros that kill those villains and have nothing to do with the bodies.' Hannibal looks over to Will, and Will looks over to Hannibal. You just look down at your feet. 'If you are looking for a way out I would suggest the southwest door, over there.' You nod yes to say that you are looking for a way out and still questioning how the heros let these guys have a full blown kitchen and a door that leads to an exit. You thank them and now you know to proceed to the southwest door."); 
            break;

            case "go southwest":
            P("You move towards the southwest door and turn the handle slowly. The door is locked. 'There's another keypad there. I believe it's Harry Potter's second kids name?' Will said. Hannibal nodding his head to confirm this. You walk over to the keypad with yet another keyboard with a code. It asks: PASSWORD:");
            break;

            case "Albus Severus Potter":
            P("The door still doesn't unlock, but it asks another question. 'What is the 65x97. Do not use a calculator. or try not to..'Type your answer.");
            break;

            case "albus severus potter":
            P("The door still doesn't unlock, but it asks another question. 'What is the 65x97. Do not use a calculator. or try not to..'Type your answer.");
            break;


            case "6305":
            P(" You open the door to reveal the inside of a waffle house. You walk in and sitting with his back towards you is Metatron. You know somethings not right because the first thing that Metatron says to you is 'You should have stayed with the cannibals for dinner.' Once he says those words you feel a knock to the head with end of a blunt instrument. You wake up in the interogation room in the east hallway.");
            roomNum = 6;
            break; 

            case "go west":
            P("You move to towards the book shelves. There are two levels of books and each neatly placed in its place. But nothing else of interest. The lights hang high and the room has a cold environment to it.");
            break;

            case "go northwest":
            P("You walk towards the northwest door. Ignoring the chatter in the back of the room your more curious about the mysterious door in the corner of the room. There's another code to the door. This time it first states the question. 'What war did John Watson fight in?'");
            roomNum = 7; 
            break;

            case "help":
              P("*******Commands*******");
              P("see: Tells you the discription of the room you are in.");
              P("");
              P("get ' object': Attempt to get an object that has been described in the room");
              P("EX: get torch");
              P("");
              P("go'direction':Send your character in the specified direction if there is a path to do so.");
              P("EX: go north, northwest, northeast...");
              P("");
              P("go to 'towards named object': Send your character closer to an object.");
              P("EX: go to key pad");
              P("");
              P("open 'object': opens the named object if possible."); 
              P("EX: open door");
              P("");
              P("flip off 'character': You give the character that is around the finger and stick out your tongue.");
              P("EX: flip off James Bond");
              P("");
              P("ask 'character': asks a character that is described to talk to you."); 
            break;

            default:
              P("I'm afraid I don't understand that reference.");
              break;

            case "inventory":
            P("WHY! You didn't pick anything up along the way because there is a risk of getting caught. WHY!");
            break;
          }
      break;

//This is what happens when you fail to answer a question corretly or flip off Ant-Man 
      case 5:
        System.out.println("You have failed and ended up in maximum security... You Idgit!! AND THERE IS A MORE SECURE ROOM IN THE MOST SECURE VILLAIN FACILITY!!");

        switch(input){
            case "Castiel Winchester":
            roomNum =6;
            break; 

            default:
            P("You can't go anywhere! You are monitered by the highly trained agent 007 who works with the M16, there's a hunter out front aswell. You are not going anywhere. ");
            break;

            case "inventory":
            P("You really think you would have an inventory in here....");
            break;
        }
      break; 

//This is in the east hallway 
      case 6:
           switch(input){
            case "go north":
            P("You can't go anywhere...");
            break;

            case "go east":
            P("You can't go anywhere...");
            break;

            case "go south":
            P("You can't go anywhere...");
            break;

            case "go west":
            P("You can't go anywhere...");
            break;

            case "see":
            P(" There are small lights around the room giving it a sort of fancy evening vibe. You are chained to the table, your ankles are chained to the chair, and the chair is bolted to the floor. You see a reflective observation window where the people outside can see you but you can't see them.");
            break;

            case "help":
            P("'There is no help out there for you.' You hear a voice in the shadows. 'Hi, y/n (instert your name where y/n is), I'm Jason Gideon. I'm a profiler and I just want to talk.' He pulls out the chair at the other end of the table to sit down. You crack your neck a little and try to make your body language a little more relaxed, because you know this man. Of course you do so you ask the question that's really on your mind.'Is Dr. Spencer Reid behind there?'Agent Gideon just looks at you. He stands up out of his chair looks to the reflective glass and goes back out the door. You gasp a little. and just out loud you say 'HE IS!!'You proceed to ask Agent Gideon.");
            break; 
            
            case "ask Agent Gideon":
            P("'Ok' Agent Gideon walks back into the room. 'I'm going to ask you a series of questions about the team that I have behind that screen and if you get all of them right I will let give you a spot on the team. Get one wrong and you go back to your cell. Deal' he says to you will a stern look on his face you know this is your one chance to clean your record so you say 'Deal'. The first question Gideon asks you is 'Who says this quote: Well, I wouldn’t have kept kicking, but I was afraid you didn’t get my plan.'");
            break;

            case "ask agent gideon":
            P("'Ok' Agent Gideon walks back into the room. 'I'm going to ask you a series of questions about the team that I have behind that screen and if you get all of them right I will let give you a spot on the team. Get one wrong and you go back to your cell. Deal' he says to you will a stern look on his face you know this is your one chance to clean your record so you say 'Deal'. The first question Gideon asks you is 'Who says this quote: Well, I wouldn’t have kept kicking, but I was afraid you didn’t get my plan.'");
            break;

            case "ask Jason Gideon":
            P("'Ok' Agent Gideon walks back into the room. 'I'm going to ask you a series of questions about the team that I have behind that screen and if you get all of them right I will let give you a spot on the team. Get one wrong and you go back to your cell. Deal' he says to you will a stern look on his face you know this is your one chance to clean your record so you say 'Deal'. The first question Gideon asks you is 'Who says this quote: Well, I wouldn’t have kept kicking, but I was afraid you didn’t get my plan.'");
            break;

            case "ask jason gideon":
            P("'Ok' Agent Gideon walks back into the room. 'I'm going to ask you a series of questions about the team that I have behind that screen and if you get all of them right I will let give you a spot on the team. Get one wrong and you go back to your cell. Deal' he says to you will a stern look on his face you know this is your one chance to clean your record so you say 'Deal'. The first question Gideon asks you is");
            P("");
            P("'Who says this quote: Well, I wouldn’t have kept kicking, but I was afraid you didn’t get my plan.'");
            break;

            case "Aaron Hotchner":
            P("Correct");
            P("");
            P("What is Dr. Spencer Reid's IQ?");
            break;

            case "aaron hotchner":
            P("Correct");
            P("");
            P("What is Dr. Spencer Reid's IQ?");
            break; 

            case "Hotch":
            P("Correct");
            P("");
            P("What is Dr. Spencer Reid's IQ?");
            break;

            case "187":
            P("Correct");
            P("");
            P("What word do profiler's use to refer to their suspect?");
            break;

            case "Unsub":
            P("Correct");
            P("");
            P("What is Captain America's Shield made out of?");
            P("'I thought we were only asking questions about your team?' you ask but he doesn't say anything. You still have to answer the question.");
            break;

            case "unsub":
            P("Correct");
            P("");
            P("What is Captain America's Shield made out of?");
            P("'I thought we were only asking questions about your team?' you ask but he doesn't say anything. You still have to answer the question.");
            break;

            case "Vibranium":
            P("Correct");
            P("");
            P("What kind of Doctor is Dr. Strange?");
            break;

            case "vibranium":
            P("Correct");
            P("");
            P("What kind of Doctor is Dr. Strange?");
            break;

            case "Neurosurgeon":
            P("Correct");
            P("");
            P("Who is the Winter Soldier? Full Name.");
            break;

            case "neurosurgeon":
            P("Correct");
            P("");
            P("Who is the Winter Soldier? Full Name.");
            break;

            case "James Buchanan Barnes":
            P("Correct");
            P("");
            P("Who kills Dumbledore? Full Name");
            break;

            case "james buchanan barnes":
            P("Correct");
            P("");
            P("Who kills Dumbledore? Full Name");
            break;

            case "Severus Snape":
            P("Correct");
            P("");
            P("Where does Sherlock Holmes live?");
            break;

            case "severus snape":
            P("Correct");
            P("");
            P("Where does Sherlock Holmes live?");
            break;

            case "221B Baker Street":
            P("Correct");
            P("");
            P("Last One. How many times does Dean Winchester die?");
            break;

            case "221b baker street":
            P("Correct");
            P("");
            P("Last One. How many times does Dean Winchester die?");
            break;

            case "221B baker street":
            P("Correct");
            P("");
            P("Last One. How many times does Dean Winchester die?");
            break;

            case "111":
            P("Correct");
            P("'I'm going to take the handcuffs off. Can I trust you. If I get to meet the team then hell yeah I'm following your rules!' 'Ok' Gideon says. Somebody enters the room. It's Aaron Hotchner. You're trying not to show any excitement but he's just giving you his everyday serious look. You feel yourself almost break from laughter but he just says 'Welcome to the team kid. You were placed here for stealing the Doctor's Tardis, not a terrible crime but enough to make the Doctor mad so you better be good or else the Doctor's going to exterminate you.' You gulp a little but you know it's true. Agent Hotchner extends his hand for you to shake it. You take it and shake firmly, while inside you just saying 'Oh my god! Oh my god! It's Hotch! It's Hotch!' Officers unshackle the ankle binds and you are free to stand up. You do so and are aloud to go through the door in the northeast corner of the room");
            break;
            
            case "go northeast":
            P("You go northeast and there's the team staring back at you. You give an awkward wave towards them. You're trying not to explode when just outside the observation room is a whole station of heroes from television and movies (That I've watched so far). All your favourite characters  out in front of you and you just got a job at villain prison. ");
            P("");
            P("North of the room you see a command center. To the west and eastof the command are doors leading into the cells. Behind him and underneath the the interogation room leads to the main floor where there are multiple desks and sitting areas. 'I can show you to an empty desk in the corner.' Reid says to you. You nod looking towards him. He's tall and you both walk down the stairs. You talk under the stairs and you didn't see the little ledges around you but there are doors in the northeast and northwest corner and on the walls are the dead. You stop before going fully done the stairs. It's a picture of everyone. Everybody  has a photo. Some with silver plates under them others just a black frame. The Avengers, the guardians of the galexy, the BAU team, the rebels alliance, Team Free Will 2.0, the Justice League, X Men, Team Avatar, Fantastic Four, 811 Team, The Doctor and all his companion, Sherlock and John along with the police force, and even more.");
            P("");
            P("Prentiss walks up behind you and rests a hand on your shoulder. This is where you're going to work no kid! You laugh 'Stole a TARDIS unlocked doors and ends up getting a job.' Never expected that to happen, but the adventure is just beginning.");
            //to be continued 
            P("");
            P("TO BE CONTINUED");
            P("");
            roomNum = 8;
            break;

            //type 'P("Type '' to continue");' when completed the second part
            case "Kilgrave":
            P("I've written more to continue ");
            roomNum = 12;
            break;

            case "extra help":
              P("*******Commands*******");
              P("see: Tells you the discription of the room you are in.");
              P("");
              P("get ' object': Attempt to get an object that has been described in the room");
              P("EX: get torch");
              P("");
              P("go'direction':Send your character in the specified direction if there is a path to do so.");
              P("EX: go north, northwest, northeast...");
              P("");
              P("go to 'towards named object': Send your character closer to an object.");
              P("EX: go to key pad");
              P("");
              P("open 'object': opens the named object if possible."); 
              P("EX: open door");
              P("");
              P("flip off 'character': You give the character that is around the finger and stick out your tongue.");
              P("EX: flip off James Bond");
              P("");
              P("ask 'character': asks a character that is described to talk to you."); 
            break;

            default:
              P("I'm extremely sorry but that is incorrect");
              roomNum = 5;
              break;
            
            case "inventory":
            P("You have anything on you... YES, you still have clothes on, and shoes, but otherwise there is no special tool given to you.");
            break;
            } 
          break;  

      //Umbridge Room 
       case 7:
        switch(input){
          case "Afganistan":
            P("That is corrent. The door opens to a fogged glass observation deck. There is another code to get past the doors that lead to another location. One the side door you see another question. There are just tons of passcodes. 'There's hero's arent' all that smart' you think to yourself, but it just make if easier for you to get out.");
            P("");
            P("The question posed this time is: In Avatar: The Last Airbender, what nation commited genocide?");
            break;

          case "afganistan":
            P("That is corrent. The door opens to a fogged glass observation deck. There is another code to get past the doors that lead to another location. One the side door you see another question. There are just tons of passcodes. 'There's hero's arent' all that smart' you think to yourself, but it just make if easier for you to get out.");
            P("");
            P("The question posed this time is: In Avatar: The Last Airbender, what nation commited genocide?");
          break;  
          
          case "Fire Nation":
          P("The glass doors slide open to reveal a woman sitting at a desk. The room was entirely pink and the woman who sat in the pink chair at the pink desk, was also wearing pink. 'Hello, dear' The person in the chair with her back turned toward you said. A chill ran down your spine. 'You are exceedingly intelligent to have unlocked that door!'She said. You feel her cold grin from just standing behind her. 'Umbridge?' You ask. 'Yes. But you must refer to me a Professor Umbridge, darling.' She spins around in her chair and stares at you with cold eyes.");
          break; 

          case "The Fire Nation":
             P("The glass doors slide open to reveal a woman sitting at a desk. The room was entirely pink and the woman who sat in the pink chair at the pink desk, was also wearing pink. 'Hello, dear' The person in the chair with her back turned toward you said. A chill ran down your spine. 'You are exceedingly intelligent to have unlocked that door!'She said. You feel her cold grin from just standing behind her. 'Umbridge?' You ask. 'Yes. But you must refer to me a Professor Umbridge, darling.' She spins around in her chair and stares at you with cold eyes.");
          break;

          case "the fire nation":
             P("The glass doors slide open to reveal a woman sitting at a desk. The room was entirely pink and the woman who sat in the pink chair at the pink desk, was also wearing pink. 'Hello, dear' The person in the chair with her back turned toward you said. A chill ran down your spine. 'You are exceedingly intelligent to have unlocked that door!'She said. You feel her cold grin from just standing behind her. 'Umbridge?' You ask. 'Yes. But you must refer to me a Professor Umbridge, darling.' She spins around in her chair and stares at you with cold eyes.");
          break;  

          case "fire nation":
             P("The glass doors slide open to reveal a woman sitting at a desk. The room was entirely pink and the woman who sat in the pink chair at the pink desk, was also wearing pink. 'Hello, dear' The person in the chair with her back turned toward you said. A chill ran down your spine. 'You are exceedingly intelligent to have unlocked that door!'She said. You feel her cold grin from just standing behind her. 'Umbridge?' You ask. 'Yes. But you must refer to me a Professor Umbridge, darling.' She spins around in her chair and stares at you with cold eyes.");
          break; 

          case "ask Professor Umbridge":
          P("'Professor Umbridge, is there a way out of here.' You ask. She laughes at you, and points at a more hidden doorway in her small pink room. 'Yes dear, but there is a code that I have no been able to solve. But I believe with your knowledge we might be able to crack it!' You give a frightened smile 'Right. WE will get out of here, professor.' She laughes at you comment and gestures toward the door.");
          break; 

          case "go to door":
          P("You walk towards the door with Umbridge's beady eyes staring at you. You see the question to unlock the door. 'Who played King George the 3rd in the Original Broadway Cast of Hamilton' Umbridge of course would have no idea because it's a muggle thing, but the man has done a good serial killer show so you know. ");
          break;

          case "Jonathan Groff":
          P("Yet again another door. This time asking a different question. Unbridge was surprised you got the first door open but was a little baffled to see another door just behind it. The next question is 'What happens to those who hesitate?'");
          P("");
          P("HINT: What happened when Thanos collected all the infinity stones and snapped the people out of existance?");
          break;

          case "they disintegrate":
          P("The truest Casifer quote of them all... Sorry for putting you through so many questions but you're almost there. Trust me.");
          P("");
          P("Umbridge just stares at you in shock. Of course they wouldn't leave just two doors to secure the evil witch. There is another door. Umbridge heaves a sigh but slaps at you to 'hurry up' You haven't even looked at the question. You roll your eyes. The only problem is, is that there is no question on the next door. It is just a numbered digit code and you nor Umbridge have any idea what it could be. But you spot a tiny scratch in with a few words etched into the metal of the door. It says 'Bright killed Martin' You aren't sure what this means and neither is Umbridge, what a help.");
          P("");
          P("You hear the door trying to be unlocked. You quickly need to find the answer to this. And then it hits you. 'When did the last episode of prodigal son air' Use those numbers to punch in the code. You only have one shot at this. Good Luck.");
          break;

          case "they Disintegrate":
          P("The truest Casifer quote of them all... Sorry for putting you through so many questions but you're almost there. Trust me.");
          P("");
          P("Umbridge just stares at you in shock. Of course they wouldn't leave just two doors to secure the evil witch. There is another door. Umbridge heaves a sigh but slaps at you to 'hurry up' You haven't even looked at the question. You roll your eyes. The only problem is, is that there is no question on the next door. It is just a numbered digit code and you nor Umbridge have any idea what it could be. But you spot a tiny scratch in with a few words etched into the metal of the door. It says 'Bright killed Martin' You aren't sure what this means and neither is Umbridge, what a help.");
          P("");
          P("You hear the door trying to be unlocked. You quickly need to find the answer to this. And then it hits you. 'When did the last episode of prodigal son air' Use those numbers to punch in the code. You only have one shot at this. Good Luck.");
          break;

          case "5182021":
          P("You open the last door. Umbridge is ecstatic. You are so happy that you finnally got out. You see the blue skys above you and teh parking lot just outside of the sector. But before you can jump to your freedom. You are trapped in a circle of huge transformers and with his large hand goes to pick you up. 'I'm afraid I cannot let you go.' said the large Autobot. It was Optimus Prime. OF COURSE because who else would it be. You are taken back into the prison. They drop you off at the doors. You are greeted by Chewbacca at the front doors and you were drugged in the neck by the Flash. Spock drags you into the interogation roon in the east hallway.");
          P("");
          P("You wake up in the interogation room in the east hallway.");
          roomNum =6; 
          break; 

          case "help":
              P("*******Commands*******");
              P("see: Tells you the discription of the room you are in.");
              P("");
              P("get ' object': Attempt to get an object that has been described in the room");
              P("EX: get torch");
              P("");
              P("go'direction':Send your character in the specified direction if there is a path to do so.");
              P("EX: go north, northwest, northeast...");
              P("");
              P("go to 'towards named object': Send your character closer to an object.");
              P("EX: go to key pad");
              P("");
              P("open 'object': opens the named object if possible."); 
              P("EX: open door");
              P("");
              P("flip off 'character': You give the character that is around the finger and stick out your tongue.");
              P("EX: flip off James Bond");
              P("");
              P("ask 'character': asks a character that is described to talk to you."); 
            break;

            default:
            P("AHHHHHHH!!!!!");
            break; 

            case "inventory":
            P("You still don't have anything in you inventory... (-_-) (;_;)");
            break;

        }
       break; 

      //Room where the game ends 
        case 8:
          switch(input){
            default:
            P("You have finally completed the game and you're still typing! Get a snack! Go outside! Because you have a life. I have a life! HYDRATE!");
            break;

             case "inventory":
            P("You don't have anything in you inventory... YOU HAVE COMPLETED THE GAME!!!! (;_;)");
            break;
        }
        break; 

        case 12:
        switch(input){
          case "go north":
          P("You walk forward down the stairs. There's a lot of people around you. You continue to follow forward into the command center. There isn't anybody to talk to because their all. There's somebody whispering your name near one of the big control pannels of the central station. It's the Doctor's 12th regeneration. A scruffy looking grey haired Scotsman.");
          break;

          case "go to Doctor":
          P("'Hi...' You say shyly. This isn't the Doctor who's Tardis you stole but he remembers. You stole the 10th's regenerations so it's still in his memory or you hacking into his precious. 'sorry, about that' you say trying to make up for you mistake. 'I shouldn't be the one that you should be apologizing to.'The Doctor replies to you. To him your actions where nothing but a many thousand years ago. Time travel is confusing. 'I'm told that we gave you a job?' You nod you head 'yes'. 'Well I have been assigned an adventure for you, put these shoes on.' He tells you so you obey and put the shoes on. Click your heels and they will take you to the room that you want to go. Just think of the room name and you will go there.' 'Uhhh..' you try to ask questions but the Doctor just turns on his heel and walks away. ");
          break; 

          case "go to doctor":
          P("'Hi...' You say shyly. This isn't the Doctor who's Tardis you stole but he remembers. You stole the 10th's regenerations so it's still in his memory or you hacking into his precious. 'sorry, about that' you say trying to make up for you mistake. 'I shouldn't be the one that you should be apologizing to.'The Doctor replies to you. To him your actions where nothing but a many thousand years ago. Time travel is confusing. 'I'm told that we gave you a job?' You nod you head 'yes'. 'Well I have been assigned an adventure for you, put these shoes on.' He tells you so you obey and put the shoes on. Click your heels and they will take you to the room that you want to go. Just think of the room name and you will go there.' 'Uhhh..' you try to ask questions but the Doctor just turns on his heel and walks away. ");
          break;

          case "click heels":
          P("You successfully click your heels like Dorthey in the Wizard of Oz. You were not instructed on what room you wanted to go into but the Doctor tweaked it so that it would take you to the locker room. Each locker has a silver plate on it with everybody's name. Each locker is designed differently, but they are all the same size. Your locker is one that is just plain silver with your name tag.");
          roomNum = 16;
          break;

          case "Click Heels":
          P("You successfully click your heels like Dorthey in the Wizard of Oz. You were not instructed on what room you wanted to go into but the Doctor tweaked it so that it would take you to the locker room. Each locker has a silver plate on it with everybody's name. Each locker is designed differently, but they are all the same size. Your locker is one that is just plain silver with your name tag.");
          roomNum = 16;
          break;

          case "click Heels":
          P("You successfully click your heels like Dorthey in the Wizard of Oz. You were not instructed on what room you wanted to go into but the Doctor tweaked it so that it would take you to the locker room. Each locker has a silver plate on it with everybody's name. Each locker is designed differently, but they are all the same size. Your locker is one that is just plain silver with your name tag.");
          roomNum = 16;
          break;

          case "Click heels":
          P("You successfully click your heels like Dorthey in the Wizard of Oz. You were not instructed on what room you wanted to go into but the Doctor tweaked it so that it would take you to the locker room. Each locker has a silver plate on it with everybody's name. Each locker is designed differently, but they are all the same size. Your locker is one that is just plain silver with your name tag.");
          roomNum = 16;
          break;

          case "go south":
          P("You walk back towards the interogation room");
          P("");
          P("You are back in the interogation room. What do you want to do?What ever you do I don't think you will be able to ");
          roomNum = 15;
          break;

          case "go east":
          P("You walk over to the east side of the large spaciouos room");
          roomNum = 13;
          P("");
          P("There lots of pictures that you can see. All of them have silver plates on them identifying the hero and how long they've been here. Some are retired, others still work, some are dead.");
          break;

          case "go west":
          P("You walk over to the west side of the large spaciouos room");
          roomNum = 14;
          P("");
          P("There lots of pictures that you can see. All of them have silver plates on them identifying the hero and how long they've been here. Some are retired, others still work, some are dead.");
          break;

          case "inventory":
          P("You do not have anything in you inventory. You pretty much just got out of jail. The people aren't sure if you pull a Loki and stab them in the back...");
          break;

        //put in new help commands because you can do different things now. 
          case "help":
          P("******YOU ASKED FOR HELP! I AM HERE TO HELP******");
          P("go 'direction': the same as before. Go north, east, south, or west.");
          P("");
          P("go to 'character name': You can approach certain characters that are described in the previous blurb of information. ");
          P(""); 
          P("inventory: Is more useful in this second part of the game. and there will be updated when you obtain different items.");
          P("");
          P("open 'object': You open the object that is described that would make sense to be opened.");
          P("");
          P("shout: you shout incoherent words that don't make any sense and everybody just stares at you confusingly.");
          break;
        }
        break;
//The side railings walls plasterd with pictures on the east side 
        case 13:
        switch(input){
          case "go north":
          P("more pictures and pictures. No people staring off into the distance soulfully because they have jobs...");
          break;

          case "go east":
          P("you want to walk off past the railing. I do not believe that to be possible");
          roomNum = 12;
          break;

          case "go west":
          P("You walk back to the main staircase of the building.");
          break;

          case "go south":
          P("more pictures and pictures. No people staring off into the distance soulfully because they have jobs...");
          break;

          case "inventory":
          P("Nothing");
          break;

          case "help":
          P("******YOU ASKED FOR HELP! I AM HERE TO HELP******");
          P("go 'direction': the same as before. Go north, east, south, or west.");
          P("");
          P("go to 'character name': You can approach certain characters that are described in the previous blurb of information. ");
          P(""); 
          P("inventory: Is more useful in this second part of the game. and there will be updated when you obtain different items.");
          P("");
          P("open 'object': You open the object that is described that would make sense to be opened.");
          P("");
          P("shout: you shout incoherent words that don't make any sense and everybody just stares at you confusingly.");
          break;
        }
        break; 

//The side railings walls plasterd with pictures on the west side 
        case 14:
        switch(input){
          case "go north":
          P("more pictures and pictures. No people staring off into the distance soulfully because they have jobs...");
          break;

          case "go east":
          P("You walk back to the main staircase of the building.");
          roomNum = 12;
          break;

          case "go west":
          P("you want to walk off past the railing. I do not believe that to be possible");
          break;

          case "go south":
          P("more pictures and pictures. No people staring off into the distance soulfully because they have jobs...");
          break;

          case "inventory":
          P("Nothing");
          break;

          case "help":
          P("******YOU ASKED FOR HELP! I AM HERE TO HELP******");
          P("go 'direction': the same as before. Go north, east, south, or west.");
          P("");
          P("go to 'character name': You can approach certain characters that are described in the previous blurb of information. ");
          P(""); 
          P("inventory: Is more useful in this second part of the game. and there will be updated when you obtain different items.");
          P("");
          P("open 'object': You open the object that is described that would make sense to be opened.");
          P("");
          P("shout: you shout incoherent words that don't make any sense and everybody just stares at you confusingly.");
          break;

        }
        break;

//Interogation room after completting the trivia puzzle
        case 15:
        switch(input){
          case "go north":
          P("you exit out of the interogation room again back to the main staircase.");
          roomNum =12;
          break;

          case "go south":
          P("there is a wall there...");
          break;

          case "go east":
          P("there is a wall there...");
          break;
          
          case "go west":
          P("there is a wall there...");
          break;

          default:
          P("you cannot do that...");
          break;

          case "inventory":
          P("nothing...");
          break;

          case "help":
          P("******YOU ASKED FOR HELP! I AM HERE TO HELP******");
          P("go 'direction': the same as before. Go north, east, south, or west.");
          P("");
          P("go to 'character name': You can approach certain characters that are described in the previous blurb of information. ");
          P(""); 
          P("inventory: Is more useful in this second part of the game. and there will be updated when you obtain different items.");
          P("");
          P("open 'object': You open the object that is described that would make sense to be opened.");
          P("");
          P("shout: you shout incoherent words that don't make any sense and everybody just stares at you confusingly.");
          break;
        }
        break;

//Locker Room - You have your own locker with clothes that you can change into.
        case 16:
        switch(input){
          case "go to locker":
          P("Your locker is locked. ");
          P("You password is: YEET (in all caps)");
          break;

          case "go to Locker":
          P("Your locker is locked. ");
          P("You password is: YEET (in all caps)");
          break;

          case "open locker":
          P("you have to say the password!");
          break;
          
          case "YEET":
          P("you open your locker with its creative password. Inside is a name tag with your name on it and just ID for you to get in and out of the building. There is books and notebooks, pencils, pens, and jackets, and clothes. Lots of clothes. There's a weird computer screen thing on the door that tells you your tasks and what you will be required to wear. Right now it has the words 'pick a jacket and click your heels to go to your desk.' There's a few jacket options that you have:");
          P("");
          P("leather");
          P("jean");
          P("winter");
          P("rain");
          P("the thinist jacket in all of existance");
          P("plaid");
          P("slutty");
          break;

          case "leather":
          P("You are now ready for you adventure looking snazzy as hell.");
          break;

          case "jean":
          P("You are now ready for you adventure looking like a a smol child in a very large jean jacket.");
          break;

          case "winter":
          P("You are now ready for your adventure in your warm winter coat. ");
          break;

          case "rain":
          P("You are now ready for you adventure looking like Georgie from IT in a little yellow rain coat.");
          break;

          case "the thinist jacket in all or existance":
          P("You are now ready for your adventure questioning if this was the right jacket to have gone with...");
          break;

          case "plaid":
          P("You are now ready for your adventure looking like a Winchester");
          break;

          case "slutty":
          P("You are now ready for you adventure looking like a stripper... I question your choices but that's ok.");
          break;
          
          case "click heels":
          P("You are transported to your desk before going on your missing because you need to get the debrief before starting.. You are transported into you chair. You arrive still getting use to heel click transpotation. There is a folder in front of you labels 'MISSION'");
          roomNum = 17;
          break;

          case "help":
          P("******YOU ASKED FOR HELP! I AM HERE TO HELP******");
          P("go 'direction': the same as before. Go north, east, south, or west.");
          P("");
          P("go to 'character name': You can approach certain characters that are described in the previous blurb of information. ");
          P(""); 
          P("inventory: Is more useful in this second part of the game. and there will be updated when you obtain different items.");
          P("");
          P("open 'object': You open the object that is described that would make sense to be opened.");
          P("");
          P("shout: you shout incoherent words that don't make any sense and everybody just stares at you confusingly.");
          break;
        }
        break;

//desk 
        case 17:
        switch(input){
          case "open folder":
          P("you open the folder of your very first mission. In bold writing on a single piece of paper is says 'Successfully retrieve Proffessor Hidgens from The Guy Who Didn't Like Musicals. Lure him in with musical songs, or get him talking about the musical that he created called 'Working Boys: A New Musicals.' That was the mission. It doesn't see all that hard. At the end there is a side note 'click your heels to go back to your locker and get a speaker, phone, and grab a cookie for the ride. Then click your heels again to go to get to the Professor'");
          break;

// click to go back to locker to get the things that you need
          case "click heels":
          P("You are back in the locker room in front of your locker. Enter your password to open it.");
          roomNum = 18;
          break;

          case "help":
          P("******YOU ASKED FOR HELP! I AM HERE TO HELP******");
          P("go 'direction': the same as before. Go north, east, south, or west.");
          P("");
          P("go to 'character name': You can approach certain characters that are described in the previous blurb of information. ");
          P(""); 
          P("inventory: Is more useful in this second part of the game. and there will be updated when you obtain different items.");
          P("");
          P("open 'object': You open the object that is described that would make sense to be opened.");
          P("");
          P("shout: you shout incoherent words that don't make any sense and everybody just stares at you confusingly.");
          break;
        }
        break;

//What to acquire to your inventory now that you have pockets...
        case 18:
        switch(input){
          case "YEET":
          P("You're locker door swings open to reveal its contents.");
          break;

          case "get speaker":
          P("you grab the speaker");
          break;

          case "get phone":
          P("you grab a phone.");
          break;

          case "grab a cookie":
          P("Eats a tea cookie would be better with tea.");
          break;

          case "eat cookie":
          P("Twas a delicious biscut. Would have been better with some tea but still good.");
          break;

          case "":
          break;

          case "help":
          P("******YOU ASKED FOR HELP! I AM HERE TO HELP******");
          P("go 'direction': the same as before. Go north, east, south, or west.");
          P("");
          P("go to 'character name': You can approach certain characters that are described in the previous blurb of information. ");
          P(""); 
          P("inventory: Is more useful in this second part of the game. and there will be updated when you obtain different items.");
          P("");
          P("open 'object': You open the object that is described that would make sense to be opened.");
          P("");
          P("shout: you shout incoherent words that don't make any sense and everybody just stares at you confusingly.");
          break;

          case "inventory":
          P("a cookie");
          P("a phone");
          P("a speaker");
          break;
        }
        break;


//You First Case 
        case 19:
        switch(input){
          case "help":
          P("******YOU ASKED FOR HELP! I AM HERE TO HELP******");
          P("go 'direction': the same as before. Go north, east, south, or west.");
          P("");
          P("go to 'character name': You can approach certain characters that are described in the previous blurb of information. ");
          P(""); 
          P("inventory: Is more useful in this second part of the game. and there will be updated when you obtain different items.");
          P("");
          P("open 'object': You open the object that is described that would make sense to be opened.");
          P("");
          P("shout: you shout incoherent words that don't make any sense and everybody just stares at you confusingly.");
          break;
        }
        break;

//The Incident where you are sent back to training school because you made a mistake in the field and need to work on skills. You have the option of also go for a desk job, but I'll only do that if I want to. Which I might.  
        case 20:
        switch(input){
          case "help":
          P("******YOU ASKED FOR HELP! I AM HERE TO HELP******");
          P("go 'direction': the same as before. Go north, east, south, or west.");
          P("");
          P("go to 'character name': You can approach certain characters that are described in the previous blurb of information. ");
          P(""); 
          P("inventory: Is more useful in this second part of the game. and there will be updated when you obtain different items.");
          P("");
          P("open 'object': You open the object that is described that would make sense to be opened.");
          P("");
          P("shout: you shout incoherent words that don't make any sense and everybody just stares at you confusingly.");
          break;
        }
        break;
        
        
      }

      P("");
    }
  }
  
    public static void P(String print){
      System.out.println(print);
    }
  
 }
