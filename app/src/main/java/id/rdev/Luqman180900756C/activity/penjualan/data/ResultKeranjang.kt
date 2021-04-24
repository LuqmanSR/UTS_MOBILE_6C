package id.rdev.Luqman180900756C.activity.penjualan.data

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName
import id.rdev.Luqman180900756C.model.Keranjang

@Generated("com.robohorse.robopojogenerator")
data class ResultKeranjang(

    @field:SerializedName("keranjang")
	val keranjang: List<Keranjang?>? = null,

    @field:SerializedName("message")
	val message: String? = null,

    @field:SerializedName("status")
	val status: Int? = null
)