package ca.squall.cupboard;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import ca.squall.cupboard.ShoppingFoodFragment.OnListFragmentInteractionListener;
import ca.squall.cupboard.dummy.DummyContent.DummyItem;

/**
 * {@link RecyclerView.Adapter} that can display a {@link DummyItem} and makes a call to the
 * specified {@link OnListFragmentInteractionListener}.
 * TODO: Replace the implementation with code for your data type.
 */
public class MyShoppingFoodRecyclerViewAdapter extends RecyclerView.Adapter<MyShoppingFoodRecyclerViewAdapter.ViewHolder> {

    private final List<Food> mShoppingFoods;
    private final OnListFragmentInteractionListener mListener;

    public MyShoppingFoodRecyclerViewAdapter(List<Food> items, OnListFragmentInteractionListener listener) {
        mShoppingFoods = items;
        mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_shoppingfood_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mShoppingFoods.get(position);
        holder.mIdView.setText(mShoppingFoods.get(position).getId().toString());
        holder.mNameView.setText(mShoppingFoods.get(position).name);

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    mListener.onListFragmentInteraction(holder.mItem);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mShoppingFoods.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mIdView;
        public final TextView mNameView;
        public Food mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            mIdView = (TextView) view.findViewById(R.id.id);
            mNameView = (TextView) view.findViewById(R.id.name);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mNameView.getText() + "'";
        }
    }
}
