package asha.binar.challengechap3tanpanavcom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import asha.binar.challengechap3tanpanavcom.databinding.ActivityMainBinding
import asha.binar.challengechap3tanpanavcom.view.AlphabetFragment
import asha.binar.challengechap3tanpanavcom.view.MyData

class MainActivity : AppCompatActivity() {

    var state = false

    val MyData = arrayListOf(
        MyData('A', arrayListOf("Asha", "Adil", "Awan", "Awam", "Abalone")),
        MyData('B', arrayListOf("Bayam", "Baju", "Batik", "Bubur", "Balon")),
        MyData('C', arrayListOf("Cantik", "Cerah", "Curug", "Cacing", "Cicak")),
        MyData('D', arrayListOf("Daun", "Dilan", "Dmasiv", "Durian", "Datang")),
        MyData('E', arrayListOf("Bayam", "Baju", "Batik", "", "Balon")),
        MyData('F', arrayListOf("Bayam", "Baju", "Batik", "", "Balon")),
        MyData('G', arrayListOf("Bayam", "Baju", "Batik", "", "Balon")),
        MyData('H', arrayListOf("Bayam", "Baju", "Batik", "", "Balon")),
        MyData('I', arrayListOf("Bayam", "Baju", "Batik", "", "Balon")),
        MyData('J', arrayListOf("Bayam", "Baju", "Batik", "", "Balon")),
        MyData('K', arrayListOf("Bayam", "Baju", "Batik", "", "Balon")),
        MyData('L', arrayListOf("Bayam", "Baju", "Batik", "", "Balon")),
        MyData('M', arrayListOf("Bayam", "Baju", "Batik", "", "Balon")),
        MyData('N', arrayListOf("Bayam", "Baju", "Batik", "", "Balon")),
        MyData('O', arrayListOf("Bayam", "Baju", "Batik", "", "Balon")),
        MyData('P', arrayListOf("Bayam", "Baju", "Batik", "", "Balon")),
        MyData('Q', arrayListOf("Bayam", "Baju", "Batik", "", "Balon")),
        MyData('R', arrayListOf("Bayam", "Baju", "Batik", "", "Balon")),
        MyData('S', arrayListOf("Bayam", "Baju", "Batik", "", "Balon")),
        MyData('T', arrayListOf("Bayam", "Baju", "Batik", "", "Balon")),
        MyData('U', arrayListOf("Bayam", "Baju", "Batik", "", "Balon")),
        MyData('V', arrayListOf("Bayam", "Baju", "Batik", "", "Balon")),
        MyData('W', arrayListOf("Bayam", "Baju", "Batik", "", "Balon")),
        MyData('X', arrayListOf("Bayam", "Baju", "Batik", "", "Balon")),
        MyData('Y', arrayListOf("Bayam", "Baju", "Batik", "", "Balon")),
        MyData('Z', arrayListOf("Bayam", "Baju", "Batik", "", "Balon")),
    )

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentContainerView, AlphabetFragment())
            commit()
        }
    }

    fun setWordFragment(alpabet: Char, fragment: Fragment){
        supportActionBar?.title = "Words That Strat With $alpabet"
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentContainerView, fragment)
            commit()
            addToBackStack(null)
        }
    }

}