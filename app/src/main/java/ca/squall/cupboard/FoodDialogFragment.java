package ca.squall.cupboard;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

/**
 * Created by charles on 2016-09-21.
 */

public class FoodDialogFragment extends DialogFragment implements View.OnClickListener {

    private Food food;
    private DialogInterface.OnDismissListener onDismissListener;

    EditText nameEditText;
    CheckBox wantSomeCheckbox, haveSomeCheckbox;

    public void setFood(Food food) {
        this.food = food;
    }

    public void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.onDismissListener = onDismissListener;
    }

    @Override
    public void onStart() {
        super.onStart();
        Dialog d = getDialog();
        if (d != null) {
            int width = ViewGroup.LayoutParams.WRAP_CONTENT;
            int height = ViewGroup.LayoutParams.WRAP_CONTENT;
            d.getWindow().setLayout(width, height);
        }

        if (food != null) {
//            kmEditText.setText(fillup.getOdometer() + "");
//            costEditText.setText(fillup.getCost().toPlainString());
//            amountEditText.setText(fillup.getAmount().toPlainString());
//            kmEditText.setText(fillup.getOdometer() + "");
//
//            if (Fillup.last(Fillup.class).getId() == fillup.getId()) {
//                deleteButton.setVisibility(View.VISIBLE);
//            }
        } else {
//            if (Fillup.count(Fillup.class) >= 1) {
//                Fillup prevFillup = Fillup.last(Fillup.class);
//                kmEditText.setText(prevFillup.getOdometer() + "");
//                deleteButton.setVisibility(View.INVISIBLE);
//            }
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View root = inflater.inflate(R.layout.food_fragment, container, false);

        nameEditText = (EditText) root.findViewById(R.id.name_edit_text);
        wantSomeCheckbox = (CheckBox) root.findViewById(R.id.want_some);
        haveSomeCheckbox = (CheckBox) root.findViewById(R.id.have_some);
//
//        costEditText = (EditText) root.findViewById(R.id.costEditText);
//        amountEditText = (EditText) root.findViewById(R.id.amountEditText);
//        kmEditText = (EditText) root.findViewById(R.id.kmEditText);

        Button cancelBtn = (Button) root.findViewById(R.id.cancel_button);
        Button saveBtn = (Button) root.findViewById(R.id.save_button);
        cancelBtn.setOnClickListener(this);
        saveBtn.setOnClickListener(this);

//        deleteButton = (ImageView) root.findViewById(R.id.deleteButton);
//        deleteButton.setOnClickListener(this);

        return root;
    }

    @Override
    public void onClick(View view) {

    }
}
