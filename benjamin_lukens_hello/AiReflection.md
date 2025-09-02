# What AI tools did I use?
I used chatGPT exclusively for error handling of age, setting up a loop
for age and name, and to give me the numbers of the noble team members. 
I also used chatGPT to help me set up an SSH key

# What was correct or incorrect? 
ChatGPT was correct about the error handling of age, and the loop, though it took
about 3 prompts to get them to work cohesively.
Chat GPT was wrong about the repo name for my SSH key, and I had to change usernames
in order for the SSH key to work for my git.

# What changes did you make and why?
I made changes to the noble team members age, as well as the introductory text.
I also made changes to variable names because I felt that some of the scanner 
variables got confusing with the global ones initialized at the top of AppLauncher.java.

# AI prompt and output 
while(true) {
      System.out.println("Enter your age:");
      String ageInput = scanner.nextLine();
      typedAge = Integer.parseInt(ageInput);
      if(typedAge < 1) {
        System.out.println("Warning: please input a valid age.");
      } else {
        break;
      }
    }

this was my input ^

this was chatGPT's output
while (true) {
    System.out.println("Enter your age:");
    String ageInput = scanner.nextLine().trim();

    try {
        typedAge = Integer.parseInt(ageInput);

        if (typedAge < 1) {
            System.out.println("Warning: please input a valid age greater than 0.");
        } else {
            break; // ✅ valid age, exit loop
        }

    } catch (NumberFormatException e) {
        System.out.println("Error: please enter numbers only.");
    }
}
this allowed me to continue using the program and loops the age 
portion of the program if I typed a word in for age. 

# What did the AI get wrong in debugging?
Everying seemed to work fine in debugging as long as I provided it a good base
for the code.

# How did you fix or improve it
I was very specific on the prompts, especially by providing
code for GPT to base its response off of. This allowed GPT 
to respond effectively and fast. 

# Debugging critique 
NA
