package org.niralmehta.camerauploadexample.adapter



import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item.view.*
import org.niralmehta.camerauploadexample.R
import org.niralmehta.camerauploadexample.data.User

/**
 * Created by shimhg02 on 2018-12-11.
 */

class RecyclerAdapter(val userList:ArrayList<User>): RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    //아이템의 갯수를 설정해줍니다 (저 안의 숫자는 보통 .size로 지정해줍니다.)
    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return   ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.bindItems(userList[position])
    }


    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        fun bindItems(data : User){
            itemView.name_tv.text = data.name
            itemView.email_tv.text = data.email
            itemView.content_tv.text = data.content
            //각각의 아이템 클릭할때의 이벤트를 띄워줍니다.
            itemView.setOnClickListener({
                //여기서 토스트메시지를 띄워줍니다.
                Toast.makeText(itemView.context, "'${data.name}'를 클릭했습니다.", Toast.LENGTH_LONG).show()
            })
        }

    }

}