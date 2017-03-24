package br.com.app.paulo.firebase.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import br.com.app.paulo.firebase.R;
import br.com.app.paulo.firebase.model.Tarefa;

/**
 * Created by pvnluz on 23/03/2017.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolders> {

    private List<Tarefa> tarefas;
    protected Context context;

    public RecyclerViewAdapter(Context context, List<Tarefa> tarefas){
        this.context = context;
        this.tarefas = tarefas;
    }

    @Override
    public RecyclerViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerViewHolders viewHolders = null;
        View layoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.tarefa_item, parent, false);
        viewHolders = new RecyclerViewHolders(layoutView, tarefas);
        return viewHolders;

    }

    @Override
    public void onBindViewHolder(RecyclerViewHolders holder, int position) {
        holder.tvTarefa.setText(tarefas.get(position).getDescricao());

    }

    @Override
    public int getItemCount() {
        return this.tarefas.size();
    }
}
