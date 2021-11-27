package lv.ievalauga.pakalpojumuportals;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ServiceInfoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ServiceInfoFragment extends Fragment {

    private String serviceName, servicePrice, specialistName;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String Service_Name = "Demo name";
    private static final String Service_Price = "00.00";

    public ServiceInfoFragment() {
        // Required empty public constructor
    }
/*
    public static ServiceInfoFragment newInstance(String serviceInfo) {
        ServiceInfoFragment fragment = new ServiceInfoFragment();
        Bundle args = new Bundle();
        args.putString(Service_Name, serviceInfo);
        fragment.setArguments(args);

        return fragment;
    }
*/
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() == null) {
            serviceName = getArguments().getString(Service_Name);
            servicePrice = getArguments().getString(Service_Price);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_service_info, container, false);
    }
}