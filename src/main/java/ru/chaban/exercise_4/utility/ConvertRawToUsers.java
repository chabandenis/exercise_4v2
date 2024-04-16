package ru.chaban.exercise_4.utility;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import ru.chaban.exercise_4.data.RawInFile;
import ru.chaban.exercise_4.domain.Users;

import java.util.ArrayList;
import java.util.List;

@Component
@AllArgsConstructor
public class ConvertRawToUsers implements ConvertRawToUsersInteface{

    @Override
    public List<Users> getUsers(List<RawInFile> rawInFiles) {
        List<Users> users = new ArrayList<>();

        for (RawInFile r :rawInFiles){
            users.add(convertFromRowInFile(r));
        }

        return users;
    }

    @Override
    public Users convertFromRowInFile(RawInFile rawInFile) {
        Users users = new Users();
        users.setId(rawInFile.getId());
        users.setUsername(rawInFile.getUsername());
        users.setFio(rawInFile.getFio());
        return users;
    }
}
