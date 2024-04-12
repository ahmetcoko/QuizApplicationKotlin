package com.example.quizapplication.Activity

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.example.quizapplication.Domain.QuestionModel
import com.example.quizapplication.R
import com.example.quizapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
        )

        binding.apply {

            SingleBtn.setOnClickListener {

                val intent = Intent(this@MainActivity,QuestionActivity::class.java)
                intent.putParcelableArrayListExtra("list" , ArrayList(questionList()))
                startActivity(intent)

            }
            bottomMenu.setItemSelected(R.id.home)
            bottomMenu.setOnItemSelectedListener {
                if (it == R.id.Board){
                    startActivity(Intent(this@MainActivity,LeaderActivity::class.java))

                }


            }


        }

    }


    //later get questions from API
    private  fun questionList():MutableList<QuestionModel>{

        val question : MutableList<QuestionModel>  = mutableListOf()
        question.add(
            QuestionModel(1,"Which planet is the largest planet in the solar system?","Earth","Mars","Neptune","Jupıter","d",5,"q_1",null)
        )
        question.add(
            QuestionModel(2,"Which country is the largest country in the world by land area?","Russia","Canada","united States","China","a",5,"q_2",null)
        )
        question.add(
            QuestionModel(3,"Which of the following substances is used as an anti-cancer medication in the medical world?","Cheese","Lemon Juice","Cannabis","Paspalum","c",5,"q_3",null)
        )
        question.add(
            QuestionModel(4,"Which moon in the Earth's solar system has an atmosphere?","Luna(Moon)","Phobos(Mars' Moon)","Venus Moon","None of the above","d",5,"q_4",null)
        )
        question.add(
            QuestionModel(5,"Which of the following symbol represents the chemical element with the atomic number 6?","O","H","C","N","c",5,"q_5",null)
        )
        question.add(
            QuestionModel(6,"Who is credited with inventing theater as we know it today?","Shakespeare","Arthur Miller","Ashkouri","Ancient Greeks","d",5,"q_6",null)
        )
        question.add(
            QuestionModel(7,"Which ocean is the largest ocean in the world?","Pacific Ocean","Atlantic Ocean","Indian Ocean","Arctic Ocean","a",5,"q_7",null)
        )
        question.add(
            QuestionModel(8,"Which religions are among the most practical religions in the world?","Islam ,Christianity , Judaism","Buddhism , Hinduism , Sikhism","Brahmanism , Yazdanism , Zarathustra","Taoism , Shintoism , Confucianism","a",5,"q_8",null)
        )
        question.add(
            QuestionModel(9,"In which continent are the most independent countries located?","Asia","Europe","Africa","America","c",5,"q_9",null)
        )
        question.add(
            QuestionModel(10,"Wich ocean has the greatest average depth?","Pacific Ocean","Atlantic Ocean","Indian Ocean","Southern Ocean","d",5,"q_10",null)
        )
        return  question
    }
}