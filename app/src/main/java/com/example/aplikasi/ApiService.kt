import com.example.aplikasi.ApiResponse
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part

interface ApiService {
    @Multipart
    @POST("predict") // Ganti "predict" dengan endpoint yang sesuai dari API Anda
    fun uploadImage(@Part image: MultipartBody.Part): Call<ApiResponse>
}
