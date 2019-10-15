package com.haizhi.graph.dc.es.service;

import com.alibaba.fastjson.JSON;
import com.haizhi.graph.common.constant.StoreType;
import com.haizhi.graph.dc.common.model.DcInboundErrorInfo;
import org.apache.commons.lang3.EnumUtils;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

/**
 * Create by zhoumingbing on 2019-06-14
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles(profiles = "")
public class ErrorInfoServiceTest {

    @Autowired
    private ErrorInfoService errorInfoService;

    private List<DcInboundErrorInfo.ErrorType> errorTypes = new ArrayList<>();
    private List<StoreType> storeTypes = new ArrayList<>();

    @Test
    public void doRecord() {
        String json = "{\"errorType\":\"CHECK_ERROR\",\"esIndex\":\"test_es.error\",\"esType\":\"test_333_error_31\",\"graph\":\"test_es\",\"hBaseTable\":\"test_es.test_333.error\",\"msg\":\"config missing field long_field\",\"rowKey\":\"test_es-test_333-CHECK_ERROR-1,703,983,452\",\"rows\":[{\"long_field\":7001245,\"object_key\":\"DkBRcWIO\",\"ctime\":\"2019-01-12\",\"double_field\":46.75664642000737,\"string_field\":\"iyllZcaTvRhFEVn\",\"date_field\":\"2019-01-10\"},{\"long_field\":3669395,\"object_key\":\"sSAWophz\",\"ctime\":\"2019-01-12\",\"double_field\":892.9056734965611,\"string_field\":\"eyhhXxhSmDpbNAh\",\"date_field\":\"2019-01-10\"},{\"long_field\":817758,\"object_key\":\"dRKPtQzo\",\"ctime\":\"2019-01-12\",\"double_field\":24.940681899282772,\"string_field\":\"uLAlOvluAIXHWce\",\"date_field\":\"2019-01-10\"},{\"long_field\":6765151,\"object_key\":\"FxlADJJl\",\"ctime\":\"2019-01-12\",\"double_field\":1194.6990574146869,\"string_field\":\"bQEykJkJIfTZJQx\",\"date_field\":\"2019-01-10\"},{\"long_field\":3679159,\"object_key\":\"yyIhfwjH\",\"ctime\":\"2019-01-12\",\"double_field\":486.6898859578762,\"string_field\":\"XlmRrYDADOIkybM\",\"date_field\":\"2019-01-10\"},{\"long_field\":5778068,\"object_key\":\"aujdgCgm\",\"ctime\":\"2019-01-12\",\"double_field\":1786.0996272354384,\"string_field\":\"PheNlnqRvPJoJBx\",\"date_field\":\"2019-01-10\"},{\"long_field\":758932,\"object_key\":\"rCNvQTQc\",\"ctime\":\"2019-01-12\",\"double_field\":1633.9618807941945,\"string_field\":\"NafcinYVzALUAiS\",\"date_field\":\"2019-01-10\"},{\"long_field\":2532735,\"object_key\":\"cLLAetvt\",\"ctime\":\"2019-01-12\",\"double_field\":1504.432908868988,\"string_field\":\"WOgjQZopqapzkwu\",\"date_field\":\"2019-01-10\"},{\"long_field\":1897252,\"object_key\":\"UPUQSMSd\",\"ctime\":\"2019-01-12\",\"double_field\":1461.5092538580184,\"string_field\":\"dUDkNGGNHoYdKHA\",\"date_field\":\"2019-01-10\"},{\"long_field\":8624883,\"object_key\":\"szsugvET\",\"ctime\":\"2019-01-12\",\"double_field\":1770.6180315746096,\"string_field\":\"gMbcYmlejLbpqzV\",\"date_field\":\"2019-01-10\"},{\"long_field\":7079339,\"object_key\":\"EotinpDX\",\"ctime\":\"2019-01-12\",\"double_field\":731.2866357022043,\"string_field\":\"SFhiUHnPCRVUWlc\",\"date_field\":\"2019-01-10\"},{\"long_field\":1862388,\"object_key\":\"UPVkrapj\",\"ctime\":\"2019-01-12\",\"double_field\":231.76015125520794,\"string_field\":\"SvsTosRrcCKtoYy\",\"date_field\":\"2019-01-10\"},{\"long_field\":7662858,\"object_key\":\"GVLkBIci\",\"ctime\":\"2019-01-12\",\"double_field\":127.8976878908211,\"string_field\":\"sbfTLDnWbkpXmqr\",\"date_field\":\"2019-01-10\"},{\"long_field\":1492213,\"object_key\":\"ZvvTXFzh\",\"ctime\":\"2019-01-12\",\"double_field\":1549.0859738518898,\"string_field\":\"rGeINRsWblvUEcZ\",\"date_field\":\"2019-01-10\"},{\"long_field\":7349166,\"object_key\":\"VxIfsRCc\",\"ctime\":\"2019-01-12\",\"double_field\":1922.113919882989,\"string_field\":\"UdqlXKyRnzVyVlo\",\"date_field\":\"2019-01-10\"},{\"long_field\":7001245,\"object_key\":\"DkBRcWIO\",\"ctime\":\"2019-01-12\",\"double_field\":46.75664642000737,\"string_field\":\"iyllZcaTvRhFEVn\",\"date_field\":\"2019-01-10\"},{\"long_field\":3669395,\"object_key\":\"sSAWophz\",\"ctime\":\"2019-01-12\",\"double_field\":892.9056734965611,\"string_field\":\"eyhhXxhSmDpbNAh\",\"date_field\":\"2019-01-10\"},{\"long_field\":817758,\"object_key\":\"dRKPtQzo\",\"ctime\":\"2019-01-12\",\"double_field\":24.940681899282772,\"string_field\":\"uLAlOvluAIXHWce\",\"date_field\":\"2019-01-10\"},{\"long_field\":6765151,\"object_key\":\"FxlADJJl\",\"ctime\":\"2019-01-12\",\"double_field\":1194.6990574146869,\"string_field\":\"bQEykJkJIfTZJQx\",\"date_field\":\"2019-01-10\"},{\"long_field\":3679159,\"object_key\":\"yyIhfwjH\",\"ctime\":\"2019-01-12\",\"double_field\":486.6898859578762,\"string_field\":\"XlmRrYDADOIkybM\",\"date_field\":\"2019-01-10\"},{\"long_field\":5778068,\"object_key\":\"aujdgCgm\",\"ctime\":\"2019-01-12\",\"double_field\":1786.0996272354384,\"string_field\":\"PheNlnqRvPJoJBx\",\"date_field\":\"2019-01-10\"},{\"long_field\":758932,\"object_key\":\"rCNvQTQc\",\"ctime\":\"2019-01-12\",\"double_field\":1633.9618807941945,\"string_field\":\"NafcinYVzALUAiS\",\"date_field\":\"2019-01-10\"},{\"long_field\":2532735,\"object_key\":\"cLLAetvt\",\"ctime\":\"2019-01-12\",\"double_field\":1504.432908868988,\"string_field\":\"WOgjQZopqapzkwu\",\"date_field\":\"2019-01-10\"},{\"long_field\":1897252,\"object_key\":\"UPUQSMSd\",\"ctime\":\"2019-01-12\",\"double_field\":1461.5092538580184,\"string_field\":\"dUDkNGGNHoYdKHA\",\"date_field\":\"2019-01-10\"},{\"long_field\":8624883,\"object_key\":\"szsugvET\",\"ctime\":\"2019-01-12\",\"double_field\":1770.6180315746096,\"string_field\":\"gMbcYmlejLbpqzV\",\"date_field\":\"2019-01-10\"},{\"long_field\":7079339,\"object_key\":\"EotinpDX\",\"ctime\":\"2019-01-12\",\"double_field\":731.2866357022043,\"string_field\":\"SFhiUHnPCRVUWlc\",\"date_field\":\"2019-01-10\"},{\"long_field\":1862388,\"object_key\":\"UPVkrapj\",\"ctime\":\"2019-01-12\",\"double_field\":231.76015125520794,\"string_field\":\"SvsTosRrcCKtoYy\",\"date_field\":\"2019-01-10\"},{\"long_field\":7662858,\"object_key\":\"GVLkBIci\",\"ctime\":\"2019-01-12\",\"double_field\":127.8976878908211,\"string_field\":\"sbfTLDnWbkpXmqr\",\"date_field\":\"2019-01-10\"},{\"long_field\":1492213,\"object_key\":\"ZvvTXFzh\",\"ctime\":\"2019-01-12\",\"double_field\":1549.0859738518898,\"string_field\":\"rGeINRsWblvUEcZ\",\"date_field\":\"2019-01-10\"},{\"long_field\":7349166,\"object_key\":\"VxIfsRCc\",\"ctime\":\"2019-01-12\",\"double_field\":1922.113919882989,\"string_field\":\"UdqlXKyRnzVyVlo\",\"date_field\":\"2019-01-10\"},{\"long_field\":7001245,\"object_key\":\"DkBRcWIO\",\"ctime\":\"2019-01-12\",\"double_field\":46.75664642000737,\"string_field\":\"iyllZcaTvRhFEVn\",\"date_field\":\"2019-01-10\"},{\"long_field\":3669395,\"object_key\":\"sSAWophz\",\"ctime\":\"2019-01-12\",\"double_field\":892.9056734965611,\"string_field\":\"eyhhXxhSmDpbNAh\",\"date_field\":\"2019-01-10\"},{\"long_field\":817758,\"object_key\":\"dRKPtQzo\",\"ctime\":\"2019-01-12\",\"double_field\":24.940681899282772,\"string_field\":\"uLAlOvluAIXHWce\",\"date_field\":\"2019-01-10\"},{\"long_field\":6765151,\"object_key\":\"FxlADJJl\",\"ctime\":\"2019-01-12\",\"double_field\":1194.6990574146869,\"string_field\":\"bQEykJkJIfTZJQx\",\"date_field\":\"2019-01-10\"},{\"long_field\":3679159,\"object_key\":\"yyIhfwjH\",\"ctime\":\"2019-01-12\",\"double_field\":486.6898859578762,\"string_field\":\"XlmRrYDADOIkybM\",\"date_field\":\"2019-01-10\"},{\"long_field\":5778068,\"object_key\":\"aujdgCgm\",\"ctime\":\"2019-01-12\",\"double_field\":1786.0996272354384,\"string_field\":\"PheNlnqRvPJoJBx\",\"date_field\":\"2019-01-10\"},{\"long_field\":758932,\"object_key\":\"rCNvQTQc\",\"ctime\":\"2019-01-12\",\"double_field\":1633.9618807941945,\"string_field\":\"NafcinYVzALUAiS\",\"date_field\":\"2019-01-10\"},{\"long_field\":2532735,\"object_key\":\"cLLAetvt\",\"ctime\":\"2019-01-12\",\"double_field\":1504.432908868988,\"string_field\":\"WOgjQZopqapzkwu\",\"date_field\":\"2019-01-10\"},{\"long_field\":1897252,\"object_key\":\"UPUQSMSd\",\"ctime\":\"2019-01-12\",\"double_field\":1461.5092538580184,\"string_field\":\"dUDkNGGNHoYdKHA\",\"date_field\":\"2019-01-10\"},{\"long_field\":8624883,\"object_key\":\"szsugvET\",\"ctime\":\"2019-01-12\",\"double_field\":1770.6180315746096,\"string_field\":\"gMbcYmlejLbpqzV\",\"date_field\":\"2019-01-10\"},{\"long_field\":7079339,\"object_key\":\"EotinpDX\",\"ctime\":\"2019-01-12\",\"double_field\":731.2866357022043,\"string_field\":\"SFhiUHnPCRVUWlc\",\"date_field\":\"2019-01-10\"},{\"long_field\":1862388,\"object_key\":\"UPVkrapj\",\"ctime\":\"2019-01-12\",\"double_field\":231.76015125520794,\"string_field\":\"SvsTosRrcCKtoYy\",\"date_field\":\"2019-01-10\"},{\"long_field\":7662858,\"object_key\":\"GVLkBIci\",\"ctime\":\"2019-01-12\",\"double_field\":127.8976878908211,\"string_field\":\"sbfTLDnWbkpXmqr\",\"date_field\":\"2019-01-10\"},{\"long_field\":1492213,\"object_key\":\"ZvvTXFzh\",\"ctime\":\"2019-01-12\",\"double_field\":1549.0859738518898,\"string_field\":\"rGeINRsWblvUEcZ\",\"date_field\":\"2019-01-10\"},{\"long_field\":7349166,\"object_key\":\"VxIfsRCc\",\"ctime\":\"2019-01-12\",\"double_field\":1922.113919882989,\"string_field\":\"UdqlXKyRnzVyVlo\",\"date_field\":\"2019-01-10\"},{\"long_field\":7001245,\"object_key\":\"DkBRcWIO\",\"ctime\":\"2019-01-12\",\"double_field\":46.75664642000737,\"string_field\":\"iyllZcaTvRhFEVn\",\"date_field\":\"2019-01-10\"},{\"long_field\":3669395,\"object_key\":\"sSAWophz\",\"ctime\":\"2019-01-12\",\"double_field\":892.9056734965611,\"string_field\":\"eyhhXxhSmDpbNAh\",\"date_field\":\"2019-01-10\"},{\"long_field\":817758,\"object_key\":\"dRKPtQzo\",\"ctime\":\"2019-01-12\",\"double_field\":24.940681899282772,\"string_field\":\"uLAlOvluAIXHWce\",\"date_field\":\"2019-01-10\"},{\"long_field\":6765151,\"object_key\":\"FxlADJJl\",\"ctime\":\"2019-01-12\",\"double_field\":1194.6990574146869,\"string_field\":\"bQEykJkJIfTZJQx\",\"date_field\":\"2019-01-10\"},{\"long_field\":3679159,\"object_key\":\"yyIhfwjH\",\"ctime\":\"2019-01-12\",\"double_field\":486.6898859578762,\"string_field\":\"XlmRrYDADOIkybM\",\"date_field\":\"2019-01-10\"},{\"long_field\":5778068,\"object_key\":\"aujdgCgm\",\"ctime\":\"2019-01-12\",\"double_field\":1786.0996272354384,\"string_field\":\"PheNlnqRvPJoJBx\",\"date_field\":\"2019-01-10\"},{\"long_field\":758932,\"object_key\":\"rCNvQTQc\",\"ctime\":\"2019-01-12\",\"double_field\":1633.9618807941945,\"string_field\":\"NafcinYVzALUAiS\",\"date_field\":\"2019-01-10\"},{\"long_field\":2532735,\"object_key\":\"cLLAetvt\",\"ctime\":\"2019-01-12\",\"double_field\":1504.432908868988,\"string_field\":\"WOgjQZopqapzkwu\",\"date_field\":\"2019-01-10\"},{\"long_field\":1897252,\"object_key\":\"UPUQSMSd\",\"ctime\":\"2019-01-12\",\"double_field\":1461.5092538580184,\"string_field\":\"dUDkNGGNHoYdKHA\",\"date_field\":\"2019-01-10\"},{\"long_field\":8624883,\"object_key\":\"szsugvET\",\"ctime\":\"2019-01-12\",\"double_field\":1770.6180315746096,\"string_field\":\"gMbcYmlejLbpqzV\",\"date_field\":\"2019-01-10\"},{\"long_field\":7079339,\"object_key\":\"EotinpDX\",\"ctime\":\"2019-01-12\",\"double_field\":731.2866357022043,\"string_field\":\"SFhiUHnPCRVUWlc\",\"date_field\":\"2019-01-10\"},{\"long_field\":1862388,\"object_key\":\"UPVkrapj\",\"ctime\":\"2019-01-12\",\"double_field\":231.76015125520794,\"string_field\":\"SvsTosRrcCKtoYy\",\"date_field\":\"2019-01-10\"},{\"long_field\":7662858,\"object_key\":\"GVLkBIci\",\"ctime\":\"2019-01-12\",\"double_field\":127.8976878908211,\"string_field\":\"sbfTLDnWbkpXmqr\",\"date_field\":\"2019-01-10\"},{\"long_field\":1492213,\"object_key\":\"ZvvTXFzh\",\"ctime\":\"2019-01-12\",\"double_field\":1549.0859738518898,\"string_field\":\"rGeINRsWblvUEcZ\",\"date_field\":\"2019-01-10\"},{\"long_field\":7349166,\"object_key\":\"VxIfsRCc\",\"ctime\":\"2019-01-12\",\"double_field\":1922.113919882989,\"string_field\":\"UdqlXKyRnzVyVlo\",\"date_field\":\"2019-01-10\"},{\"long_field\":7001245,\"object_key\":\"DkBRcWIO\",\"ctime\":\"2019-01-12\",\"double_field\":46.75664642000737,\"string_field\":\"iyllZcaTvRhFEVn\",\"date_field\":\"2019-01-10\"},{\"long_field\":3669395,\"object_key\":\"sSAWophz\",\"ctime\":\"2019-01-12\",\"double_field\":892.9056734965611,\"string_field\":\"eyhhXxhSmDpbNAh\",\"date_field\":\"2019-01-10\"},{\"long_field\":817758,\"object_key\":\"dRKPtQzo\",\"ctime\":\"2019-01-12\",\"double_field\":24.940681899282772,\"string_field\":\"uLAlOvluAIXHWce\",\"date_field\":\"2019-01-10\"},{\"long_field\":6765151,\"object_key\":\"FxlADJJl\",\"ctime\":\"2019-01-12\",\"double_field\":1194.6990574146869,\"string_field\":\"bQEykJkJIfTZJQx\",\"date_field\":\"2019-01-10\"},{\"long_field\":3679159,\"object_key\":\"yyIhfwjH\",\"ctime\":\"2019-01-12\",\"double_field\":486.6898859578762,\"string_field\":\"XlmRrYDADOIkybM\",\"date_field\":\"2019-01-10\"},{\"long_field\":5778068,\"object_key\":\"aujdgCgm\",\"ctime\":\"2019-01-12\",\"double_field\":1786.0996272354384,\"string_field\":\"PheNlnqRvPJoJBx\",\"date_field\":\"2019-01-10\"},{\"long_field\":758932,\"object_key\":\"rCNvQTQc\",\"ctime\":\"2019-01-12\",\"double_field\":1633.9618807941945,\"string_field\":\"NafcinYVzALUAiS\",\"date_field\":\"2019-01-10\"},{\"long_field\":2532735,\"object_key\":\"cLLAetvt\",\"ctime\":\"2019-01-12\",\"double_field\":1504.432908868988,\"string_field\":\"WOgjQZopqapzkwu\",\"date_field\":\"2019-01-10\"},{\"long_field\":1897252,\"object_key\":\"UPUQSMSd\",\"ctime\":\"2019-01-12\",\"double_field\":1461.5092538580184,\"string_field\":\"dUDkNGGNHoYdKHA\",\"date_field\":\"2019-01-10\"},{\"long_field\":8624883,\"object_key\":\"szsugvET\",\"ctime\":\"2019-01-12\",\"double_field\":1770.6180315746096,\"string_field\":\"gMbcYmlejLbpqzV\",\"date_field\":\"2019-01-10\"},{\"long_field\":7079339,\"object_key\":\"EotinpDX\",\"ctime\":\"2019-01-12\",\"double_field\":731.2866357022043,\"string_field\":\"SFhiUHnPCRVUWlc\",\"date_field\":\"2019-01-10\"},{\"long_field\":1862388,\"object_key\":\"UPVkrapj\",\"ctime\":\"2019-01-12\",\"double_field\":231.76015125520794,\"string_field\":\"SvsTosRrcCKtoYy\",\"date_field\":\"2019-01-10\"},{\"long_field\":7662858,\"object_key\":\"GVLkBIci\",\"ctime\":\"2019-01-12\",\"double_field\":127.8976878908211,\"string_field\":\"sbfTLDnWbkpXmqr\",\"date_field\":\"2019-01-10\"},{\"long_field\":1492213,\"object_key\":\"ZvvTXFzh\",\"ctime\":\"2019-01-12\",\"double_field\":1549.0859738518898,\"string_field\":\"rGeINRsWblvUEcZ\",\"date_field\":\"2019-01-10\"},{\"long_field\":7349166,\"object_key\":\"VxIfsRCc\",\"ctime\":\"2019-01-12\",\"double_field\":1922.113919882989,\"string_field\":\"UdqlXKyRnzVyVlo\",\"date_field\":\"2019-01-10\"},{\"long_field\":7001245,\"object_key\":\"DkBRcWIO\",\"ctime\":\"2019-01-12\",\"double_field\":46.75664642000737,\"string_field\":\"iyllZcaTvRhFEVn\",\"date_field\":\"2019-01-10\"},{\"long_field\":3669395,\"object_key\":\"sSAWophz\",\"ctime\":\"2019-01-12\",\"double_field\":892.9056734965611,\"string_field\":\"eyhhXxhSmDpbNAh\",\"date_field\":\"2019-01-10\"},{\"long_field\":817758,\"object_key\":\"dRKPtQzo\",\"ctime\":\"2019-01-12\",\"double_field\":24.940681899282772,\"string_field\":\"uLAlOvluAIXHWce\",\"date_field\":\"2019-01-10\"},{\"long_field\":6765151,\"object_key\":\"FxlADJJl\",\"ctime\":\"2019-01-12\",\"double_field\":1194.6990574146869,\"string_field\":\"bQEykJkJIfTZJQx\",\"date_field\":\"2019-01-10\"},{\"long_field\":3679159,\"object_key\":\"yyIhfwjH\",\"ctime\":\"2019-01-12\",\"double_field\":486.6898859578762,\"string_field\":\"XlmRrYDADOIkybM\",\"date_field\":\"2019-01-10\"},{\"long_field\":5778068,\"object_key\":\"aujdgCgm\",\"ctime\":\"2019-01-12\",\"double_field\":1786.0996272354384,\"string_field\":\"PheNlnqRvPJoJBx\",\"date_field\":\"2019-01-10\"},{\"long_field\":758932,\"object_key\":\"rCNvQTQc\",\"ctime\":\"2019-01-12\",\"double_field\":1633.9618807941945,\"string_field\":\"NafcinYVzALUAiS\",\"date_field\":\"2019-01-10\"},{\"long_field\":2532735,\"object_key\":\"cLLAetvt\",\"ctime\":\"2019-01-12\",\"double_field\":1504.432908868988,\"string_field\":\"WOgjQZopqapzkwu\",\"date_field\":\"2019-01-10\"},{\"long_field\":1897252,\"object_key\":\"UPUQSMSd\",\"ctime\":\"2019-01-12\",\"double_field\":1461.5092538580184,\"string_field\":\"dUDkNGGNHoYdKHA\",\"date_field\":\"2019-01-10\"},{\"long_field\":8624883,\"object_key\":\"szsugvET\",\"ctime\":\"2019-01-12\",\"double_field\":1770.6180315746096,\"string_field\":\"gMbcYmlejLbpqzV\",\"date_field\":\"2019-01-10\"},{\"long_field\":7079339,\"object_key\":\"EotinpDX\",\"ctime\":\"2019-01-12\",\"double_field\":731.2866357022043,\"string_field\":\"SFhiUHnPCRVUWlc\",\"date_field\":\"2019-01-10\"},{\"long_field\":1862388,\"object_key\":\"UPVkrapj\",\"ctime\":\"2019-01-12\",\"double_field\":231.76015125520794,\"string_field\":\"SvsTosRrcCKtoYy\",\"date_field\":\"2019-01-10\"},{\"long_field\":7662858,\"object_key\":\"GVLkBIci\",\"ctime\":\"2019-01-12\",\"double_field\":127.8976878908211,\"string_field\":\"sbfTLDnWbkpXmqr\",\"date_field\":\"2019-01-10\"},{\"long_field\":1492213,\"object_key\":\"ZvvTXFzh\",\"ctime\":\"2019-01-12\",\"double_field\":1549.0859738518898,\"string_field\":\"rGeINRsWblvUEcZ\",\"date_field\":\"2019-01-10\"},{\"long_field\":7349166,\"object_key\":\"VxIfsRCc\",\"ctime\":\"2019-01-12\",\"double_field\":1922.113919882989,\"string_field\":\"UdqlXKyRnzVyVlo\",\"date_field\":\"2019-01-10\"},{\"long_field\":7001245,\"object_key\":\"DkBRcWIO\",\"ctime\":\"2019-01-12\",\"double_field\":46.75664642000737,\"string_field\":\"iyllZcaTvRhFEVn\",\"date_field\":\"2019-01-10\"},{\"long_field\":3669395,\"object_key\":\"sSAWophz\",\"ctime\":\"2019-01-12\",\"double_field\":892.9056734965611,\"string_field\":\"eyhhXxhSmDpbNAh\",\"date_field\":\"2019-01-10\"},{\"long_field\":817758,\"object_key\":\"dRKPtQzo\",\"ctime\":\"2019-01-12\",\"double_field\":24.940681899282772,\"string_field\":\"uLAlOvluAIXHWce\",\"date_field\":\"2019-01-10\"},{\"long_field\":6765151,\"object_key\":\"FxlADJJl\",\"ctime\":\"2019-01-12\",\"double_field\":1194.6990574146869,\"string_field\":\"bQEykJkJIfTZJQx\",\"date_field\":\"2019-01-10\"},{\"long_field\":3679159,\"object_key\":\"yyIhfwjH\",\"ctime\":\"2019-01-12\",\"double_field\":486.6898859578762,\"string_field\":\"XlmRrYDADOIkybM\",\"date_field\":\"2019-01-10\"},{\"long_field\":5778068,\"object_key\":\"aujdgCgm\",\"ctime\":\"2019-01-12\",\"double_field\":1786.0996272354384,\"string_field\":\"PheNlnqRvPJoJBx\",\"date_field\":\"2019-01-10\"},{\"long_field\":758932,\"object_key\":\"rCNvQTQc\",\"ctime\":\"2019-01-12\",\"double_field\":1633.9618807941945,\"string_field\":\"NafcinYVzALUAiS\",\"date_field\":\"2019-01-10\"},{\"long_field\":2532735,\"object_key\":\"cLLAetvt\",\"ctime\":\"2019-01-12\",\"double_field\":1504.432908868988,\"string_field\":\"WOgjQZopqapzkwu\",\"date_field\":\"2019-01-10\"},{\"long_field\":1897252,\"object_key\":\"UPUQSMSd\",\"ctime\":\"2019-01-12\",\"double_field\":1461.5092538580184,\"string_field\":\"dUDkNGGNHoYdKHA\",\"date_field\":\"2019-01-10\"},{\"long_field\":8624883,\"object_key\":\"szsugvET\",\"ctime\":\"2019-01-12\",\"double_field\":1770.6180315746096,\"string_field\":\"gMbcYmlejLbpqzV\",\"date_field\":\"2019-01-10\"}],\"schema\":\"test_333\",\"taskId\":20,\"taskInstanceId\":31}";
        DcInboundErrorInfo dcInboundErrorInfo = JSON.parseObject(json, DcInboundErrorInfo.class);
        for (int i = 0; i < 10; i++) {
            dcInboundErrorInfo.setTaskInstanceId(dcInboundErrorInfo.getTaskInstanceId() + 1);
            errorInfoService.doRecord(dcInboundErrorInfo);
        }
    }

    @Before
    public void init() {
        errorTypes.addAll(EnumUtils.getEnumList(DcInboundErrorInfo.ErrorType.class));
        storeTypes.addAll(EnumUtils.getEnumList(StoreType.class));
    }

    @Test
    public void insertTestData() {
        String json = "{\"errorType\":\"CHECK_ERROR\",\"esIndex\":\"test_es.error\",\"esType\":\"test_333_error_31\",\"graph\":\"test_es\",\"hBaseTable\":\"test_es.test_333.error\",\"msg\":\"config missing field long_field\",\"rowKey\":\"test_es-test_333-CHECK_ERROR-1,703,983,452\",\"rows\":[{\"long_field\":7001245,\"object_key\":\"DkBRcWIO\",\"ctime\":\"2019-01-12\",\"double_field\":46.75664642000737,\"string_field\":\"iyllZcaTvRhFEVn\",\"date_field\":\"2019-01-10\"},{\"long_field\":3669395,\"object_key\":\"sSAWophz\",\"ctime\":\"2019-01-12\",\"double_field\":892.9056734965611,\"string_field\":\"eyhhXxhSmDpbNAh\",\"date_field\":\"2019-01-10\"},{\"long_field\":817758,\"object_key\":\"dRKPtQzo\",\"ctime\":\"2019-01-12\",\"double_field\":24.940681899282772,\"string_field\":\"uLAlOvluAIXHWce\",\"date_field\":\"2019-01-10\"},{\"long_field\":6765151,\"object_key\":\"FxlADJJl\",\"ctime\":\"2019-01-12\",\"double_field\":1194.6990574146869,\"string_field\":\"bQEykJkJIfTZJQx\",\"date_field\":\"2019-01-10\"},{\"long_field\":3679159,\"object_key\":\"yyIhfwjH\",\"ctime\":\"2019-01-12\",\"double_field\":486.6898859578762,\"string_field\":\"XlmRrYDADOIkybM\",\"date_field\":\"2019-01-10\"},{\"long_field\":5778068,\"object_key\":\"aujdgCgm\",\"ctime\":\"2019-01-12\",\"double_field\":1786.0996272354384,\"string_field\":\"PheNlnqRvPJoJBx\",\"date_field\":\"2019-01-10\"},{\"long_field\":758932,\"object_key\":\"rCNvQTQc\",\"ctime\":\"2019-01-12\",\"double_field\":1633.9618807941945,\"string_field\":\"NafcinYVzALUAiS\",\"date_field\":\"2019-01-10\"},{\"long_field\":2532735,\"object_key\":\"cLLAetvt\",\"ctime\":\"2019-01-12\",\"double_field\":1504.432908868988,\"string_field\":\"WOgjQZopqapzkwu\",\"date_field\":\"2019-01-10\"},{\"long_field\":1897252,\"object_key\":\"UPUQSMSd\",\"ctime\":\"2019-01-12\",\"double_field\":1461.5092538580184,\"string_field\":\"dUDkNGGNHoYdKHA\",\"date_field\":\"2019-01-10\"},{\"long_field\":8624883,\"object_key\":\"szsugvET\",\"ctime\":\"2019-01-12\",\"double_field\":1770.6180315746096,\"string_field\":\"gMbcYmlejLbpqzV\",\"date_field\":\"2019-01-10\"},{\"long_field\":7079339,\"object_key\":\"EotinpDX\",\"ctime\":\"2019-01-12\",\"double_field\":731.2866357022043,\"string_field\":\"SFhiUHnPCRVUWlc\",\"date_field\":\"2019-01-10\"},{\"long_field\":1862388,\"object_key\":\"UPVkrapj\",\"ctime\":\"2019-01-12\",\"double_field\":231.76015125520794,\"string_field\":\"SvsTosRrcCKtoYy\",\"date_field\":\"2019-01-10\"},{\"long_field\":7662858,\"object_key\":\"GVLkBIci\",\"ctime\":\"2019-01-12\",\"double_field\":127.8976878908211,\"string_field\":\"sbfTLDnWbkpXmqr\",\"date_field\":\"2019-01-10\"},{\"long_field\":1492213,\"object_key\":\"ZvvTXFzh\",\"ctime\":\"2019-01-12\",\"double_field\":1549.0859738518898,\"string_field\":\"rGeINRsWblvUEcZ\",\"date_field\":\"2019-01-10\"},{\"long_field\":7349166,\"object_key\":\"VxIfsRCc\",\"ctime\":\"2019-01-12\",\"double_field\":1922.113919882989,\"string_field\":\"UdqlXKyRnzVyVlo\",\"date_field\":\"2019-01-10\"},{\"long_field\":7001245,\"object_key\":\"DkBRcWIO\",\"ctime\":\"2019-01-12\",\"double_field\":46.75664642000737,\"string_field\":\"iyllZcaTvRhFEVn\",\"date_field\":\"2019-01-10\"},{\"long_field\":3669395,\"object_key\":\"sSAWophz\",\"ctime\":\"2019-01-12\",\"double_field\":892.9056734965611,\"string_field\":\"eyhhXxhSmDpbNAh\",\"date_field\":\"2019-01-10\"},{\"long_field\":817758,\"object_key\":\"dRKPtQzo\",\"ctime\":\"2019-01-12\",\"double_field\":24.940681899282772,\"string_field\":\"uLAlOvluAIXHWce\",\"date_field\":\"2019-01-10\"},{\"long_field\":6765151,\"object_key\":\"FxlADJJl\",\"ctime\":\"2019-01-12\",\"double_field\":1194.6990574146869,\"string_field\":\"bQEykJkJIfTZJQx\",\"date_field\":\"2019-01-10\"},{\"long_field\":3679159,\"object_key\":\"yyIhfwjH\",\"ctime\":\"2019-01-12\",\"double_field\":486.6898859578762,\"string_field\":\"XlmRrYDADOIkybM\",\"date_field\":\"2019-01-10\"},{\"long_field\":5778068,\"object_key\":\"aujdgCgm\",\"ctime\":\"2019-01-12\",\"double_field\":1786.0996272354384,\"string_field\":\"PheNlnqRvPJoJBx\",\"date_field\":\"2019-01-10\"},{\"long_field\":758932,\"object_key\":\"rCNvQTQc\",\"ctime\":\"2019-01-12\",\"double_field\":1633.9618807941945,\"string_field\":\"NafcinYVzALUAiS\",\"date_field\":\"2019-01-10\"},{\"long_field\":2532735,\"object_key\":\"cLLAetvt\",\"ctime\":\"2019-01-12\",\"double_field\":1504.432908868988,\"string_field\":\"WOgjQZopqapzkwu\",\"date_field\":\"2019-01-10\"},{\"long_field\":1897252,\"object_key\":\"UPUQSMSd\",\"ctime\":\"2019-01-12\",\"double_field\":1461.5092538580184,\"string_field\":\"dUDkNGGNHoYdKHA\",\"date_field\":\"2019-01-10\"},{\"long_field\":8624883,\"object_key\":\"szsugvET\",\"ctime\":\"2019-01-12\",\"double_field\":1770.6180315746096,\"string_field\":\"gMbcYmlejLbpqzV\",\"date_field\":\"2019-01-10\"},{\"long_field\":7079339,\"object_key\":\"EotinpDX\",\"ctime\":\"2019-01-12\",\"double_field\":731.2866357022043,\"string_field\":\"SFhiUHnPCRVUWlc\",\"date_field\":\"2019-01-10\"},{\"long_field\":1862388,\"object_key\":\"UPVkrapj\",\"ctime\":\"2019-01-12\",\"double_field\":231.76015125520794,\"string_field\":\"SvsTosRrcCKtoYy\",\"date_field\":\"2019-01-10\"},{\"long_field\":7662858,\"object_key\":\"GVLkBIci\",\"ctime\":\"2019-01-12\",\"double_field\":127.8976878908211,\"string_field\":\"sbfTLDnWbkpXmqr\",\"date_field\":\"2019-01-10\"},{\"long_field\":1492213,\"object_key\":\"ZvvTXFzh\",\"ctime\":\"2019-01-12\",\"double_field\":1549.0859738518898,\"string_field\":\"rGeINRsWblvUEcZ\",\"date_field\":\"2019-01-10\"},{\"long_field\":7349166,\"object_key\":\"VxIfsRCc\",\"ctime\":\"2019-01-12\",\"double_field\":1922.113919882989,\"string_field\":\"UdqlXKyRnzVyVlo\",\"date_field\":\"2019-01-10\"},{\"long_field\":7001245,\"object_key\":\"DkBRcWIO\",\"ctime\":\"2019-01-12\",\"double_field\":46.75664642000737,\"string_field\":\"iyllZcaTvRhFEVn\",\"date_field\":\"2019-01-10\"},{\"long_field\":3669395,\"object_key\":\"sSAWophz\",\"ctime\":\"2019-01-12\",\"double_field\":892.9056734965611,\"string_field\":\"eyhhXxhSmDpbNAh\",\"date_field\":\"2019-01-10\"},{\"long_field\":817758,\"object_key\":\"dRKPtQzo\",\"ctime\":\"2019-01-12\",\"double_field\":24.940681899282772,\"string_field\":\"uLAlOvluAIXHWce\",\"date_field\":\"2019-01-10\"},{\"long_field\":6765151,\"object_key\":\"FxlADJJl\",\"ctime\":\"2019-01-12\",\"double_field\":1194.6990574146869,\"string_field\":\"bQEykJkJIfTZJQx\",\"date_field\":\"2019-01-10\"},{\"long_field\":3679159,\"object_key\":\"yyIhfwjH\",\"ctime\":\"2019-01-12\",\"double_field\":486.6898859578762,\"string_field\":\"XlmRrYDADOIkybM\",\"date_field\":\"2019-01-10\"},{\"long_field\":5778068,\"object_key\":\"aujdgCgm\",\"ctime\":\"2019-01-12\",\"double_field\":1786.0996272354384,\"string_field\":\"PheNlnqRvPJoJBx\",\"date_field\":\"2019-01-10\"},{\"long_field\":758932,\"object_key\":\"rCNvQTQc\",\"ctime\":\"2019-01-12\",\"double_field\":1633.9618807941945,\"string_field\":\"NafcinYVzALUAiS\",\"date_field\":\"2019-01-10\"},{\"long_field\":2532735,\"object_key\":\"cLLAetvt\",\"ctime\":\"2019-01-12\",\"double_field\":1504.432908868988,\"string_field\":\"WOgjQZopqapzkwu\",\"date_field\":\"2019-01-10\"},{\"long_field\":1897252,\"object_key\":\"UPUQSMSd\",\"ctime\":\"2019-01-12\",\"double_field\":1461.5092538580184,\"string_field\":\"dUDkNGGNHoYdKHA\",\"date_field\":\"2019-01-10\"},{\"long_field\":8624883,\"object_key\":\"szsugvET\",\"ctime\":\"2019-01-12\",\"double_field\":1770.6180315746096,\"string_field\":\"gMbcYmlejLbpqzV\",\"date_field\":\"2019-01-10\"},{\"long_field\":7079339,\"object_key\":\"EotinpDX\",\"ctime\":\"2019-01-12\",\"double_field\":731.2866357022043,\"string_field\":\"SFhiUHnPCRVUWlc\",\"date_field\":\"2019-01-10\"},{\"long_field\":1862388,\"object_key\":\"UPVkrapj\",\"ctime\":\"2019-01-12\",\"double_field\":231.76015125520794,\"string_field\":\"SvsTosRrcCKtoYy\",\"date_field\":\"2019-01-10\"},{\"long_field\":7662858,\"object_key\":\"GVLkBIci\",\"ctime\":\"2019-01-12\",\"double_field\":127.8976878908211,\"string_field\":\"sbfTLDnWbkpXmqr\",\"date_field\":\"2019-01-10\"},{\"long_field\":1492213,\"object_key\":\"ZvvTXFzh\",\"ctime\":\"2019-01-12\",\"double_field\":1549.0859738518898,\"string_field\":\"rGeINRsWblvUEcZ\",\"date_field\":\"2019-01-10\"},{\"long_field\":7349166,\"object_key\":\"VxIfsRCc\",\"ctime\":\"2019-01-12\",\"double_field\":1922.113919882989,\"string_field\":\"UdqlXKyRnzVyVlo\",\"date_field\":\"2019-01-10\"},{\"long_field\":7001245,\"object_key\":\"DkBRcWIO\",\"ctime\":\"2019-01-12\",\"double_field\":46.75664642000737,\"string_field\":\"iyllZcaTvRhFEVn\",\"date_field\":\"2019-01-10\"},{\"long_field\":3669395,\"object_key\":\"sSAWophz\",\"ctime\":\"2019-01-12\",\"double_field\":892.9056734965611,\"string_field\":\"eyhhXxhSmDpbNAh\",\"date_field\":\"2019-01-10\"},{\"long_field\":817758,\"object_key\":\"dRKPtQzo\",\"ctime\":\"2019-01-12\",\"double_field\":24.940681899282772,\"string_field\":\"uLAlOvluAIXHWce\",\"date_field\":\"2019-01-10\"},{\"long_field\":6765151,\"object_key\":\"FxlADJJl\",\"ctime\":\"2019-01-12\",\"double_field\":1194.6990574146869,\"string_field\":\"bQEykJkJIfTZJQx\",\"date_field\":\"2019-01-10\"},{\"long_field\":3679159,\"object_key\":\"yyIhfwjH\",\"ctime\":\"2019-01-12\",\"double_field\":486.6898859578762,\"string_field\":\"XlmRrYDADOIkybM\",\"date_field\":\"2019-01-10\"},{\"long_field\":5778068,\"object_key\":\"aujdgCgm\",\"ctime\":\"2019-01-12\",\"double_field\":1786.0996272354384,\"string_field\":\"PheNlnqRvPJoJBx\",\"date_field\":\"2019-01-10\"},{\"long_field\":758932,\"object_key\":\"rCNvQTQc\",\"ctime\":\"2019-01-12\",\"double_field\":1633.9618807941945,\"string_field\":\"NafcinYVzALUAiS\",\"date_field\":\"2019-01-10\"},{\"long_field\":2532735,\"object_key\":\"cLLAetvt\",\"ctime\":\"2019-01-12\",\"double_field\":1504.432908868988,\"string_field\":\"WOgjQZopqapzkwu\",\"date_field\":\"2019-01-10\"},{\"long_field\":1897252,\"object_key\":\"UPUQSMSd\",\"ctime\":\"2019-01-12\",\"double_field\":1461.5092538580184,\"string_field\":\"dUDkNGGNHoYdKHA\",\"date_field\":\"2019-01-10\"},{\"long_field\":8624883,\"object_key\":\"szsugvET\",\"ctime\":\"2019-01-12\",\"double_field\":1770.6180315746096,\"string_field\":\"gMbcYmlejLbpqzV\",\"date_field\":\"2019-01-10\"},{\"long_field\":7079339,\"object_key\":\"EotinpDX\",\"ctime\":\"2019-01-12\",\"double_field\":731.2866357022043,\"string_field\":\"SFhiUHnPCRVUWlc\",\"date_field\":\"2019-01-10\"},{\"long_field\":1862388,\"object_key\":\"UPVkrapj\",\"ctime\":\"2019-01-12\",\"double_field\":231.76015125520794,\"string_field\":\"SvsTosRrcCKtoYy\",\"date_field\":\"2019-01-10\"},{\"long_field\":7662858,\"object_key\":\"GVLkBIci\",\"ctime\":\"2019-01-12\",\"double_field\":127.8976878908211,\"string_field\":\"sbfTLDnWbkpXmqr\",\"date_field\":\"2019-01-10\"},{\"long_field\":1492213,\"object_key\":\"ZvvTXFzh\",\"ctime\":\"2019-01-12\",\"double_field\":1549.0859738518898,\"string_field\":\"rGeINRsWblvUEcZ\",\"date_field\":\"2019-01-10\"},{\"long_field\":7349166,\"object_key\":\"VxIfsRCc\",\"ctime\":\"2019-01-12\",\"double_field\":1922.113919882989,\"string_field\":\"UdqlXKyRnzVyVlo\",\"date_field\":\"2019-01-10\"},{\"long_field\":7001245,\"object_key\":\"DkBRcWIO\",\"ctime\":\"2019-01-12\",\"double_field\":46.75664642000737,\"string_field\":\"iyllZcaTvRhFEVn\",\"date_field\":\"2019-01-10\"},{\"long_field\":3669395,\"object_key\":\"sSAWophz\",\"ctime\":\"2019-01-12\",\"double_field\":892.9056734965611,\"string_field\":\"eyhhXxhSmDpbNAh\",\"date_field\":\"2019-01-10\"},{\"long_field\":817758,\"object_key\":\"dRKPtQzo\",\"ctime\":\"2019-01-12\",\"double_field\":24.940681899282772,\"string_field\":\"uLAlOvluAIXHWce\",\"date_field\":\"2019-01-10\"},{\"long_field\":6765151,\"object_key\":\"FxlADJJl\",\"ctime\":\"2019-01-12\",\"double_field\":1194.6990574146869,\"string_field\":\"bQEykJkJIfTZJQx\",\"date_field\":\"2019-01-10\"},{\"long_field\":3679159,\"object_key\":\"yyIhfwjH\",\"ctime\":\"2019-01-12\",\"double_field\":486.6898859578762,\"string_field\":\"XlmRrYDADOIkybM\",\"date_field\":\"2019-01-10\"},{\"long_field\":5778068,\"object_key\":\"aujdgCgm\",\"ctime\":\"2019-01-12\",\"double_field\":1786.0996272354384,\"string_field\":\"PheNlnqRvPJoJBx\",\"date_field\":\"2019-01-10\"},{\"long_field\":758932,\"object_key\":\"rCNvQTQc\",\"ctime\":\"2019-01-12\",\"double_field\":1633.9618807941945,\"string_field\":\"NafcinYVzALUAiS\",\"date_field\":\"2019-01-10\"},{\"long_field\":2532735,\"object_key\":\"cLLAetvt\",\"ctime\":\"2019-01-12\",\"double_field\":1504.432908868988,\"string_field\":\"WOgjQZopqapzkwu\",\"date_field\":\"2019-01-10\"},{\"long_field\":1897252,\"object_key\":\"UPUQSMSd\",\"ctime\":\"2019-01-12\",\"double_field\":1461.5092538580184,\"string_field\":\"dUDkNGGNHoYdKHA\",\"date_field\":\"2019-01-10\"},{\"long_field\":8624883,\"object_key\":\"szsugvET\",\"ctime\":\"2019-01-12\",\"double_field\":1770.6180315746096,\"string_field\":\"gMbcYmlejLbpqzV\",\"date_field\":\"2019-01-10\"},{\"long_field\":7079339,\"object_key\":\"EotinpDX\",\"ctime\":\"2019-01-12\",\"double_field\":731.2866357022043,\"string_field\":\"SFhiUHnPCRVUWlc\",\"date_field\":\"2019-01-10\"},{\"long_field\":1862388,\"object_key\":\"UPVkrapj\",\"ctime\":\"2019-01-12\",\"double_field\":231.76015125520794,\"string_field\":\"SvsTosRrcCKtoYy\",\"date_field\":\"2019-01-10\"},{\"long_field\":7662858,\"object_key\":\"GVLkBIci\",\"ctime\":\"2019-01-12\",\"double_field\":127.8976878908211,\"string_field\":\"sbfTLDnWbkpXmqr\",\"date_field\":\"2019-01-10\"},{\"long_field\":1492213,\"object_key\":\"ZvvTXFzh\",\"ctime\":\"2019-01-12\",\"double_field\":1549.0859738518898,\"string_field\":\"rGeINRsWblvUEcZ\",\"date_field\":\"2019-01-10\"},{\"long_field\":7349166,\"object_key\":\"VxIfsRCc\",\"ctime\":\"2019-01-12\",\"double_field\":1922.113919882989,\"string_field\":\"UdqlXKyRnzVyVlo\",\"date_field\":\"2019-01-10\"},{\"long_field\":7001245,\"object_key\":\"DkBRcWIO\",\"ctime\":\"2019-01-12\",\"double_field\":46.75664642000737,\"string_field\":\"iyllZcaTvRhFEVn\",\"date_field\":\"2019-01-10\"},{\"long_field\":3669395,\"object_key\":\"sSAWophz\",\"ctime\":\"2019-01-12\",\"double_field\":892.9056734965611,\"string_field\":\"eyhhXxhSmDpbNAh\",\"date_field\":\"2019-01-10\"},{\"long_field\":817758,\"object_key\":\"dRKPtQzo\",\"ctime\":\"2019-01-12\",\"double_field\":24.940681899282772,\"string_field\":\"uLAlOvluAIXHWce\",\"date_field\":\"2019-01-10\"},{\"long_field\":6765151,\"object_key\":\"FxlADJJl\",\"ctime\":\"2019-01-12\",\"double_field\":1194.6990574146869,\"string_field\":\"bQEykJkJIfTZJQx\",\"date_field\":\"2019-01-10\"},{\"long_field\":3679159,\"object_key\":\"yyIhfwjH\",\"ctime\":\"2019-01-12\",\"double_field\":486.6898859578762,\"string_field\":\"XlmRrYDADOIkybM\",\"date_field\":\"2019-01-10\"},{\"long_field\":5778068,\"object_key\":\"aujdgCgm\",\"ctime\":\"2019-01-12\",\"double_field\":1786.0996272354384,\"string_field\":\"PheNlnqRvPJoJBx\",\"date_field\":\"2019-01-10\"},{\"long_field\":758932,\"object_key\":\"rCNvQTQc\",\"ctime\":\"2019-01-12\",\"double_field\":1633.9618807941945,\"string_field\":\"NafcinYVzALUAiS\",\"date_field\":\"2019-01-10\"},{\"long_field\":2532735,\"object_key\":\"cLLAetvt\",\"ctime\":\"2019-01-12\",\"double_field\":1504.432908868988,\"string_field\":\"WOgjQZopqapzkwu\",\"date_field\":\"2019-01-10\"},{\"long_field\":1897252,\"object_key\":\"UPUQSMSd\",\"ctime\":\"2019-01-12\",\"double_field\":1461.5092538580184,\"string_field\":\"dUDkNGGNHoYdKHA\",\"date_field\":\"2019-01-10\"},{\"long_field\":8624883,\"object_key\":\"szsugvET\",\"ctime\":\"2019-01-12\",\"double_field\":1770.6180315746096,\"string_field\":\"gMbcYmlejLbpqzV\",\"date_field\":\"2019-01-10\"},{\"long_field\":7079339,\"object_key\":\"EotinpDX\",\"ctime\":\"2019-01-12\",\"double_field\":731.2866357022043,\"string_field\":\"SFhiUHnPCRVUWlc\",\"date_field\":\"2019-01-10\"},{\"long_field\":1862388,\"object_key\":\"UPVkrapj\",\"ctime\":\"2019-01-12\",\"double_field\":231.76015125520794,\"string_field\":\"SvsTosRrcCKtoYy\",\"date_field\":\"2019-01-10\"},{\"long_field\":7662858,\"object_key\":\"GVLkBIci\",\"ctime\":\"2019-01-12\",\"double_field\":127.8976878908211,\"string_field\":\"sbfTLDnWbkpXmqr\",\"date_field\":\"2019-01-10\"},{\"long_field\":1492213,\"object_key\":\"ZvvTXFzh\",\"ctime\":\"2019-01-12\",\"double_field\":1549.0859738518898,\"string_field\":\"rGeINRsWblvUEcZ\",\"date_field\":\"2019-01-10\"},{\"long_field\":7349166,\"object_key\":\"VxIfsRCc\",\"ctime\":\"2019-01-12\",\"double_field\":1922.113919882989,\"string_field\":\"UdqlXKyRnzVyVlo\",\"date_field\":\"2019-01-10\"},{\"long_field\":7001245,\"object_key\":\"DkBRcWIO\",\"ctime\":\"2019-01-12\",\"double_field\":46.75664642000737,\"string_field\":\"iyllZcaTvRhFEVn\",\"date_field\":\"2019-01-10\"},{\"long_field\":3669395,\"object_key\":\"sSAWophz\",\"ctime\":\"2019-01-12\",\"double_field\":892.9056734965611,\"string_field\":\"eyhhXxhSmDpbNAh\",\"date_field\":\"2019-01-10\"},{\"long_field\":817758,\"object_key\":\"dRKPtQzo\",\"ctime\":\"2019-01-12\",\"double_field\":24.940681899282772,\"string_field\":\"uLAlOvluAIXHWce\",\"date_field\":\"2019-01-10\"},{\"long_field\":6765151,\"object_key\":\"FxlADJJl\",\"ctime\":\"2019-01-12\",\"double_field\":1194.6990574146869,\"string_field\":\"bQEykJkJIfTZJQx\",\"date_field\":\"2019-01-10\"},{\"long_field\":3679159,\"object_key\":\"yyIhfwjH\",\"ctime\":\"2019-01-12\",\"double_field\":486.6898859578762,\"string_field\":\"XlmRrYDADOIkybM\",\"date_field\":\"2019-01-10\"},{\"long_field\":5778068,\"object_key\":\"aujdgCgm\",\"ctime\":\"2019-01-12\",\"double_field\":1786.0996272354384,\"string_field\":\"PheNlnqRvPJoJBx\",\"date_field\":\"2019-01-10\"},{\"long_field\":758932,\"object_key\":\"rCNvQTQc\",\"ctime\":\"2019-01-12\",\"double_field\":1633.9618807941945,\"string_field\":\"NafcinYVzALUAiS\",\"date_field\":\"2019-01-10\"},{\"long_field\":2532735,\"object_key\":\"cLLAetvt\",\"ctime\":\"2019-01-12\",\"double_field\":1504.432908868988,\"string_field\":\"WOgjQZopqapzkwu\",\"date_field\":\"2019-01-10\"},{\"long_field\":1897252,\"object_key\":\"UPUQSMSd\",\"ctime\":\"2019-01-12\",\"double_field\":1461.5092538580184,\"string_field\":\"dUDkNGGNHoYdKHA\",\"date_field\":\"2019-01-10\"},{\"long_field\":8624883,\"object_key\":\"szsugvET\",\"ctime\":\"2019-01-12\",\"double_field\":1770.6180315746096,\"string_field\":\"gMbcYmlejLbpqzV\",\"date_field\":\"2019-01-10\"}],\"schema\":\"test_333\",\"taskId\":20,\"taskInstanceId\":20190617001}";
        DcInboundErrorInfo dcInboundErrorInfo = JSON.parseObject(json, DcInboundErrorInfo.class);
        List<Map<String, Object>> rows = dcInboundErrorInfo.getRows();
        dcInboundErrorInfo.setRows(null);
        int i = 0;
        for (Map<String, Object> row : rows) {
            dcInboundErrorInfo.setRows(Arrays.asList(row));
            dcInboundErrorInfo.setErrorType(errorTypes.get(new Random().nextInt(errorTypes.size())));
            if (dcInboundErrorInfo.getErrorType() == DcInboundErrorInfo.ErrorType.RUNTIME_ERROR) {
                dcInboundErrorInfo.setStoreType(storeTypes.get(i++ % (storeTypes.size() - 1)));
            }
            errorInfoService.doRecord(dcInboundErrorInfo);
        }
    }

}
