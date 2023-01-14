package cn.itedus.lottery.interfaces.assembler;

import cn.itedus.lottery.domain.activity.model.vo.ActivityVO;
import cn.itedus.lottery.rpc.activity.deploy.dto.ActivityDTO;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-12-21T21:10:14+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_352 (Amazon.com Inc.)"
)
@Component
public class ActivityMappingImpl implements ActivityMapping {

    @Override
    public ActivityDTO sourceToTarget(ActivityVO var1) {
        if ( var1 == null ) {
            return null;
        }

        ActivityDTO activityDTO = new ActivityDTO();

        activityDTO.setCreateTime( var1.getCreateTime() );
        activityDTO.setId( var1.getId() );
        activityDTO.setActivityId( var1.getActivityId() );
        activityDTO.setActivityName( var1.getActivityName() );
        activityDTO.setActivityDesc( var1.getActivityDesc() );
        activityDTO.setBeginDateTime( var1.getBeginDateTime() );
        activityDTO.setEndDateTime( var1.getEndDateTime() );
        activityDTO.setStockCount( var1.getStockCount() );
        activityDTO.setStockSurplusCount( var1.getStockSurplusCount() );
        activityDTO.setTakeCount( var1.getTakeCount() );
        activityDTO.setStrategyId( var1.getStrategyId() );
        activityDTO.setState( var1.getState() );
        activityDTO.setCreator( var1.getCreator() );
        activityDTO.setUpdateTime( var1.getUpdateTime() );

        return activityDTO;
    }

    @Override
    public ActivityVO targetToSource(ActivityDTO var1) {
        if ( var1 == null ) {
            return null;
        }

        ActivityVO activityVO = new ActivityVO();

        activityVO.setCreateTime( var1.getCreateTime() );
        activityVO.setId( var1.getId() );
        activityVO.setActivityId( var1.getActivityId() );
        activityVO.setActivityName( var1.getActivityName() );
        activityVO.setActivityDesc( var1.getActivityDesc() );
        activityVO.setBeginDateTime( var1.getBeginDateTime() );
        activityVO.setEndDateTime( var1.getEndDateTime() );
        activityVO.setStockCount( var1.getStockCount() );
        activityVO.setStockSurplusCount( var1.getStockSurplusCount() );
        activityVO.setTakeCount( var1.getTakeCount() );
        activityVO.setStrategyId( var1.getStrategyId() );
        activityVO.setState( var1.getState() );
        activityVO.setCreator( var1.getCreator() );
        activityVO.setUpdateTime( var1.getUpdateTime() );

        return activityVO;
    }

    @Override
    public List<ActivityVO> targetToSource(List<ActivityDTO> var1) {
        if ( var1 == null ) {
            return null;
        }

        List<ActivityVO> list = new ArrayList<ActivityVO>( var1.size() );
        for ( ActivityDTO activityDTO : var1 ) {
            list.add( targetToSource( activityDTO ) );
        }

        return list;
    }

    @Override
    public List<ActivityDTO> sourceToTarget(Stream<ActivityVO> stream) {
        if ( stream == null ) {
            return null;
        }

        return stream.map( activityVO -> sourceToTarget( activityVO ) )
        .collect( Collectors.toCollection( ArrayList<ActivityDTO>::new ) );
    }

    @Override
    public List<ActivityVO> targetToSource(Stream<ActivityDTO> stream) {
        if ( stream == null ) {
            return null;
        }

        return stream.map( activityDTO -> targetToSource( activityDTO ) )
        .collect( Collectors.toCollection( ArrayList<ActivityVO>::new ) );
    }

    @Override
    public List<ActivityDTO> sourceToTarget(List<ActivityVO> var1) {
        if ( var1 == null ) {
            return null;
        }

        List<ActivityDTO> list = new ArrayList<ActivityDTO>( var1.size() );
        for ( ActivityVO activityVO : var1 ) {
            list.add( sourceToTarget( activityVO ) );
        }

        return list;
    }
}
