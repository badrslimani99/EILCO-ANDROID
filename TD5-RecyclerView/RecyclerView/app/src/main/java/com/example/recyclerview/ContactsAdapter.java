package com.example.recyclerview;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.annotation.GlideModule;
import com.bumptech.glide.module.AppGlideModule;

import java.util.List;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ViewHolder> {

    private final List<Contact> mContacts;
    private Context cont;

    public ContactsAdapter(List<Contact> mContacts) {
        this.mContacts = mContacts;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView firstNameTextView;
        public TextView lastnameTextView;
        public ImageView PictureView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            firstNameTextView = itemView.findViewById(R.id.contact_firstname);
            lastnameTextView = itemView.findViewById(R.id.contact_lastname);
            PictureView = itemView.findViewById(R.id.imageView);
        }
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        cont=context;

        View contactView = inflater.inflate(R.layout.item_contact, parent, false);

        return new ViewHolder(contactView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Contact contact = mContacts.get(position);

        TextView firstNameTextView = holder.firstNameTextView;
        firstNameTextView.setText(contact.getPrenom());

        TextView lastNameTextView = holder.lastnameTextView;
        lastNameTextView.setText(contact.getNom());

        ImageView PictureView = holder.PictureView;
        Glide.with(cont).load(contact.getImageUrl()).override(300, 200).into(PictureView);

    }

    @Override
    public int getItemCount() {
        return mContacts.size();
    }
}
