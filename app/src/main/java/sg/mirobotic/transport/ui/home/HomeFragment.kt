package sg.mirobotic.transport.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import dagger.hilt.android.AndroidEntryPoint
import sg.mirobotic.transport.databinding.FragmentHomeBinding
import sg.mirobotic.transport.ui.base.BaseFragment


@AndroidEntryPoint
class HomeFragment: BaseFragment<FragmentHomeBinding>() {

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ) = FragmentHomeBinding.inflate(inflater, container, false)

}