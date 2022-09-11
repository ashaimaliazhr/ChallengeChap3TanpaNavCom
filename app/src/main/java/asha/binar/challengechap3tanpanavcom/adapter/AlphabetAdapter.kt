package asha.binar.challengechap3tanpanavcom.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import asha.binar.challengechap3tanpanavcom.MainActivity
import asha.binar.challengechap3tanpanavcom.R
import asha.binar.challengechap3tanpanavcom.view.MyData
import asha.binar.challengechap3tanpanavcom.view.WordFragment

class AlphabetAdapter : RecyclerView.Adapter<AlphabetAdapter.AlphabetViewHolder>(){

    private var diffCallBack = object: DiffUtil.ItemCallback<MyData>(){
        override fun areItemsTheSame(oldItem: MyData, newItem: MyData): Boolean {
            return oldItem.Alphabet == newItem.Alphabet
        }

        override fun areContentsTheSame(oldItem: MyData, newItem: MyData): Boolean {
            return oldItem.hashCode() == newItem.hashCode()
        }
    }

    private var differ = AsyncListDiffer(this, diffCallBack)
    fun submitData(value: ArrayList<MyData>) =differ.submitList(value)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AlphabetAdapter.AlphabetViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return AlphabetViewHolder(view)
    }

    override fun onBindViewHolder(holder: AlphabetAdapter.AlphabetViewHolder, position: Int) {
        val data = differ.currentList[position]
        with(holder) {
            button.text = data.Alphabet.toString()
            button.setOnClickListener{
                val activity = (itemView.context as MainActivity)
                activity.setWordFragment(data.Alphabet, WordFragment(data.List))
            }
        }
    }

    override fun getItemCount(): Int = differ.currentList.size

    inner class AlphabetViewHolder(itemView :View): RecyclerView.ViewHolder(itemView){
        val button: Button = itemView.findViewById(R.id.btnClick)
    }

}