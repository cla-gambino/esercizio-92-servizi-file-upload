package develhope.esercizio92servizifileupload.DTO;

import develhope.esercizio92servizifileupload.entities.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DownloadProfilePictureDTO {

    private UserEntity userEntity;

    private byte[] profileImage;
}
