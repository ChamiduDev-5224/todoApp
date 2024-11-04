package com.example.todoApp.service;

import com.example.todoApp.dto.UserDTO;
import com.example.todoApp.model.User;
import com.example.todoApp.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class UserService {
@Autowired
     private UserRepository userRepository;
    @Autowired
    private ModelMapper modelMapper;

    public List<UserDTO> getAllUsers(){
        List<User>userList = userRepository.findAll();

        List<UserDTO> userDtoList = modelMapper.map(userList, new TypeToken<List<UserDTO>>() {}.getType());
        return userDtoList;
}
}


