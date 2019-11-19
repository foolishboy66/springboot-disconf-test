package com.github.foolishboy.disconf.test.conf;

import com.baidu.disconf.client.common.annotations.DisconfFile;
import com.baidu.disconf.client.common.annotations.DisconfFileItem;
import org.springframework.stereotype.Service;

/**
 * disconf动态加载配置
 *
 * @author foolishboy66
 * @date 2019-11-18 11:02
 */
@Service
@DisconfFile(filename = "remote.properties")
public class SystemConf {

    private String hostName;

    @DisconfFileItem(name = "host.name")
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }
}
    