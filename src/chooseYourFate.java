import javax.swing.JOptionPane;

public class chooseYourFate {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,"Try not to die");
		String userInput = JOptionPane.showInputDialog("You see a BASKETBALL and a PEN AND PAPER what do you choose?");
		if (userInput.equalsIgnoreCase("basketball")) {
			String weirdBounce = JOptionPane.showInputDialog(
					"You start bouncing the ball it takes a werid bounce and it rolls off do you FOLLOW THE BALL or GET THE PEN AND PAPER");
			if (weirdBounce.equalsIgnoreCase("get the pen and paper")) {
				JOptionPane.showMessageDialog(null,
						"You quit on the basketball, then you see a group of wolves, you trip and then...");
				JOptionPane.showMessageDialog(null, "YOU DIE");
			} else if (weirdBounce.equalsIgnoreCase("Follow the ball")) {
				String cliff = JOptionPane.showInputDialog(
						"You are behind the ball so you start running, you then see the ball go off a cliff do you either TAKE THE LONG WAY DOWN or JUMP OFF");

				if (cliff.equalsIgnoreCase("take the long way down")) {
					String fishPeople = JOptionPane
							.showInputDialog("You meet three fish people, do you FIGHT THEM or TALK TO THEM");

					if (fishPeople.equalsIgnoreCase("fight them")) {
						JOptionPane.showMessageDialog(null,
								"You fight the fish people but, they throw a spear at you.");
						JOptionPane.showMessageDialog(null, "YOU DIE");
					} else if (fishPeople.equalsIgnoreCase("talk to them")) {
						JOptionPane.showMessageDialog(null,
								"You talk to the Fish people and they say don't go to the blue tree");
					}
				} else if (cliff.equalsIgnoreCase("jump off")) {
					String waterJump = JOptionPane.showInputDialog(
							"You jump off the cliff and see a body of water the basketball goes in a underwater cave, do you SWIM IN THE CAVE or get out and INVESTIGATE");
					if (waterJump.equalsIgnoreCase("Investigate")) {
						String hikingGem = JOptionPane.showInputDialog(
								"You start hiking and you spot a yellow glowing gem, do you TAKE IT or THROW A ROCK AT IT");
					} else if (waterJump.equalsIgnoreCase("Swim in the Cave")) {
						String runOxygen = JOptionPane.showInputDialog(
								"You swim in the cave but, you run out of oxygen, do you HOLD YOUR BREATH LONGER or TRY AND FIND A AIRPOCKET");
					}
				}
			}

		} else if (userInput.equalsIgnoreCase("pen and paper")) {
			String flyBothering = JOptionPane
					.showInputDialog("You start drawing and a fly starts bothering you do you IGNORE IT or KILL IT");
			if (flyBothering.equalsIgnoreCase("Ignore it")) {
				JOptionPane.showMessageDialog(null,
						"you ignore the fly it then starts going in your ear (you can't do anything becuase you ignored it so) you start to blank out");
				JOptionPane.showMessageDialog(null, "YOU DIE");
			} else if (flyBothering.equalsIgnoreCase("kill it")) {
				String lifeBlood = JOptionPane.showInputDialog(
						"you stab the fly with your pen, then you see the blood of the fly make plants and animals. You then take the fly and GROW PLANTS AND ANIMALS or DRINK THE BLOOD");
				if (lifeBlood.equalsIgnoreCase("Grow plants and animals")) {
					JOptionPane.showInputDialog(
							"You make this place all bright and green with plants and animals do you TRAIN THE ANIMALS or MAKE POTIONS WITH THE PlANTS");

				} else if (lifeBlood.equalsIgnoreCase("drink the blood")) {
					String dietBlood = JOptionPane.showInputDialog(
							"You drink the blood and nothing happens do you wait for the effect to happen by SLEEP or do you EAT THE FLY");

					if (dietBlood.equalsIgnoreCase("SLEEP")) {
						String inception = JOptionPane.showInputDialog(
								"When you sleep you grow wings, multiple eyes, and eight legs! You start to see someone using a pen and paper, do you BOTHER THEM or LEAVE THEM BE");
					} else if (dietBlood.equalsIgnoreCase("Eat the fly")) {
						JOptionPane.showMessageDialog(null, "You try to eat the fly but, you swallowed it");
						JOptionPane.showMessageDialog(null, "YOU DIE");
					}

				}
			}
		}

	}

}
