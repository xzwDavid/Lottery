package cn.itedus.lottery.test.interfaces;

import cn.itedus.lottery.rpc.activity.deploy.ILotteryActivityDeploy;
import cn.itedus.lottery.rpc.activity.deploy.req.ActivityPageReq;
import cn.itedus.lottery.rpc.activity.deploy.res.ActivityRes;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @description: 活动部署测试
 * @author: 小傅哥，微信：fustack
 * @date: 2021/12/11
 * @github: https://github.com/fuzhengwei
 * @Copyright: 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class LotteryActivityDeployTest {

    private Logger logger = LoggerFactory.getLogger(LotteryActivityDeployTest.class);

    @Resource
    private ILotteryActivityDeploy lotteryActivityDeploy;

    @Test
    public void test_queryActivityListByPageForErp() {
        ActivityPageReq req = new ActivityPageReq(1, 10);
        req.setErpId("xiaofuge");

        ActivityRes res = lotteryActivityDeploy.queryActivityListByPageForErp(req);

        logger.info("请求参数：{}", JSON.toJSONString(req));
        logger.info("测试结果：{}", JSON.toJSONString(res));
    }

}
