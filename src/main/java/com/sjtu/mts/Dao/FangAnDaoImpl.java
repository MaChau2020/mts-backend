package com.sjtu.mts.Dao;

import com.sjtu.mts.Entity.FangAn;
import com.sjtu.mts.Repository.FangAnRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FangAnDaoImpl implements FangAnDao {
    private final FangAnRepository fangAnRepository;

    public FangAnDaoImpl(FangAnRepository fangAnRepository) {
        this.fangAnRepository = fangAnRepository;
    }

    @Override
    public  FangAn save(FangAn fangAn){return fangAnRepository.save(fangAn);}

    @Override
    public List<FangAn> findAllByUsername(String username){
        return fangAnRepository.findAllByUsername(username);
    }

    @Override
    public Boolean existsByUsernameAndProgrammeName(String username,String programme){
        return fangAnRepository.existsByUsernameAndProgrammeName(username,programme);
    }
    @Override
    public FangAn findByFid(long fid){
        return  fangAnRepository.findByFid(fid);
    }

    @Override
    public void deleteByFid(long fid){
        fangAnRepository.deleteByFid(fid);
    }
}
