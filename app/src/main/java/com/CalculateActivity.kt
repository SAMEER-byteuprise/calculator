package com

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculator.databinding.ActivityCalculateBinding
import net.objecthunter.exp4j.ExpressionBuilder

class CalculateActivity : AppCompatActivity() {
private  lateinit var binding: ActivityCalculateBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalculateBinding.inflate(layoutInflater)
        setContentView(binding.root)


binding.clear.setOnClickListener{
    binding.inputtext.text = ""
    binding.outputtext.text = ""

}
binding.zero.setOnClickListener {
    binding.inputtext.append("0")
}

        binding.one.setOnClickListener {
            binding.inputtext.append("1")
        }

        binding.two.setOnClickListener {
            binding.inputtext.append("2")
        }

        binding.three.setOnClickListener {
            binding.inputtext.append("3")
        }

        binding.four.setOnClickListener {
            binding.inputtext.append("4")
        }
        binding.five.setOnClickListener {
            binding.inputtext.append("5")
        }
        binding.six.setOnClickListener {
            binding.inputtext.append("6")
        }
        binding.seven.setOnClickListener {
            binding.inputtext.append("7")
        }
        binding.eight.setOnClickListener {
            binding.inputtext.append("8")
        }

        binding.nine.setOnClickListener {
            binding.inputtext.append("9")
        }

        binding.nine.setOnClickListener {
            binding.inputtext.append("9")
        }

        binding.dot.setOnClickListener {
            binding.inputtext.append(".")
        }

        binding.oc.setOnClickListener {
            binding.inputtext.append("(")
        }

        binding.bc.setOnClickListener {
            binding.inputtext.append(")")
        }
        binding.devide.setOnClickListener {
            binding.inputtext.append("÷")
        }
        binding.multyple.setOnClickListener {
            binding.inputtext.append("×")
        }
        binding.minus.setOnClickListener {
            binding.inputtext.append("-")
        }
        binding.plus.setOnClickListener {
            binding.inputtext.append("+")
        }
        binding.equal.setOnClickListener {
           val expression = ExpressionBuilder(binding.inputtext.text.toString()).build()
            val result = expression.evaluate()
            val `long-result` = result.toLong()


            if (result == `long-result`.toDouble()){
                binding.outputtext.text = `long-result`.toString()
            }
            else{
                binding.outputtext.text = result.toString()
            }
        }


    }
}