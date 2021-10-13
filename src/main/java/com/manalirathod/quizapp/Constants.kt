package com.manalirathod.quizapp

object Constants{

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()
//1
        val ques1 = Question(1,"Name the first women to swim across the English Channel?",
            "Arti Gupta",
            "Ujwala Rai",
            "None of above",
            "Sneh Singh",
            1)
        questionsList.add(ques1)

//        2

        val ques2 = Question(2,"Youngest women to climb Mount Everest two times in India?",
            "Omana",
            "None of these",
            "Dicky Dolma",
            "Faria",
            3)
        questionsList.add(ques2)
//        3
        val ques3 = Question(3,"First Women to pass MA in India?",
            "Leila Seth",
            "Kadambani Bose",
            "Thresia",
            "Chandra Mukhi Bose",
            4)
        questionsList.add(ques3)
//        4
        val ques4 = Question(4,"what is capital of India ?",
            "Mumbai ",
            "New Delhi",
            "Goa",
            "Kanpur",
            2)
        questionsList.add(ques4)
//        5
        val ques5 = Question(5, "Who was the first Indian woman in Space ?",
            "Kalpana Chawla",
            "Sunita Williams",
            "Koneru Humpy",
            "None of the above",
            1
        )
        questionsList.add(ques5)
//        6
        val ques6 = Question(6, "Who wrote the Indian National Anthem ?",
            "Bakim Chandra Chatterji",
            "Rabindranath Tagore",
            "Swami Vivekanand",
            "None of the above",
            2
        )
        questionsList.add(ques6)
//        7
        val ques7 = Question(7,
            "Who was the first President of India ?",
            "Abdul Kalam",
            "Lal Bahadur Shastri",
            "Dr. Rajendra Prasad",
            "Zakir Hussain",
            3
        )
        questionsList.add(ques7)
//        8
        val ques8 = Question(  8, "Who built the Jama Masjid ?",
            "Jahangir",
            "Akbar",
            "Imam Bukhari",
            "Shah Jahan",
            4
        )
        questionsList.add(ques8)
//        9
        val ques9 = Question(9,"First Women to circumnavigate or sail round the world?",
            "Anna George",
            "Sucheta Kriplani",
            "None of above",
            "Ujwala Rai",
            3)
        questionsList.add(ques9)
//        10
        val ques10 = Question(10,"Name the first women who became the doctor in India?",
            "Kadambini Ganguli",
            "Ujwala Rai",
            "None of above",
            "Cornelia Sorabji",
            1)
        questionsList.add(ques10)
//        11
        val ques11 = Question(11,"Name the first women who became the Speaker of Lok Sabha in India?",
            "Mrs Sarojini Naidu",
            "Mrs Shanno Devi",
            "Reita Faria",
            "Lelia Seth",
            2)
        questionsList.add(ques11)
//        12
        val ques12 = Question(12,"For which of the following disciplines is Nobel Prize awarded?",
            "Physics & Chemistry",
            "Physiology or Medicine ",
            "Literature, Peace & Economics",
            "All of Above",
            4)
        questionsList.add(ques12)
//        13
        val ques13 = Question(13,"Which is the largest coffee producing state of India?",
            "Kerala",
            "Tamil Nadu",
            "Karnataka",
            "Arunachal Pradesh",
            3)
        questionsList.add(ques13)
//        14
        val ques14 = Question(14,"Which state has the largest population?",
            "Uttar Pradesh",
            "Maharashtra",
            "Bihar",
            "Goa",
            1)
        questionsList.add(ques14)
//        15
        val ques15 = Question(15,"India is a federal union comprising twenty-nine states and how many union territories?",
            "Six",
            "Seven",
            "Nine",
            "Five",
            2)
        questionsList.add(ques15)











        return questionsList

    }
}