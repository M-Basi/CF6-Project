package gr.aueb.cf.ch16;

public class GenericMain {

    public static void main(String[] args) {
        ISpeakable whiteCat = new Cat("whiteCat");
        ISpeakable blackDog = new Dog("blackDog", 5D);



        GenericSpeakingSchool genericSpeakingSchool1  = new GenericSpeakingSchool(whiteCat);
        GenericSpeakingSchool genericSpeakingSchool2  = new GenericSpeakingSchool(blackDog);
        genericSpeakingSchool1.learnToSpeak();
        genericSpeakingSchool2.learnToSpeak();

    }
}
