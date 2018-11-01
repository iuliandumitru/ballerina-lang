|Scenario Name|Heap Size|Concurrent Users|Message Size (Bytes)|Back-end Service Delay (ms)|# Samples|Error Count|Error %|Throughput (Requests/sec)|Average Response Time (ms)|Standard Deviation of Response Time (ms)|Minimum Response Time (ms)|Maximum Response Time (ms) (ms)|75th Percentile of Response Time (ms)|90th Percentile of Response Time (ms)|95th Percentile of Response Time (ms)|98th Percentile of Response Time (ms)|99th Percentile of Response Time (ms)|99.9th Percentile of Response Time (ms)|Received (KB/sec)|Sent (KB/sec)|Ballerina GC Throughput (%)|Ballerina Memory Footprint (M)|Average of Ballerina Memory Footprint After Full GC (M)|Standard Deviation of Ballerina Memory Footprint After Full GC (M)|Ballerina Load Average - Last 1 minute|Ballerina Load Average - Last 5 minutes|Ballerina Load Average - Last 15 minutes|
|---|---|---|---:|---:|---:|---:|---:|---:|---:|---:|---:|---:|---:|---:|---:|---:|---:|---:|---:|---:|---:|---:|---:|---:|---:|---:|---:|
|Passthrough HTTP service|2G|100|50|0|13306867|0|0|22175.3|4.47|5.96|0|210|4|6|10|20|35|71|3984.62|5024.09|99.53|2046|||5.90|6.67|6.98|
|Passthrough HTTP service|2G|100|1024|0|12543603|0|0|20903.22|4.74|6.13|0|200|5|6|11|21|36|72|23679.43|24659.26|99.56|2046|||4.85|6.62|6.76|
|Passthrough HTTP service|2G|300|50|0|14789461|0|0|24645.94|12.12|10.66|0|284|13|19|25|41|64|124|4428.57|5583.85|98.93|2043.5|||2.61|6.44|7.29|
|Passthrough HTTP service|2G|300|1024|0|13985229|0|0|23305.03|12.82|10.21|0|304|14|20|27|42|60|113|26400.22|27492.65|98.99|2043.5|||2.83|6.86|7.56|
|Passthrough HTTP service|2G|1000|50|0|14526641|0|0|24205.02|41.25|23.33|0|410|48|64|81|113|137|216|4349.34|5483.95|97.03|2038|||4.11|7.89|5.92|
|Passthrough HTTP service|2G|1000|1024|0|13649398|0|0|22742.78|43.9|22.17|0|363|52|68|83|109|130|199|25763.31|26829.37|97.28|2036.5|||3.22|7.65|7.60|
|Passthrough HTTPS service|2G|100|50|0|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|97.28|2036.5|||0.03|0.96|3.58|
|Passthrough HTTPS service|2G|100|1024|0|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|97.28|2036.5|||0.07|0.67|3.15|
|Passthrough HTTPS service|2G|300|50|0|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|97.28|2036.5|||0.10|2.07|4.62|
|Passthrough HTTPS service|2G|300|1024|0|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|97.28|2036.5|||0.08|1.42|4.07|
|Passthrough HTTPS service|2G|1000|50|0|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|0|1963|||0.77|4.48|5.96|
|Passthrough HTTPS service|2G|1000|1024|0|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|0|1963|||0.37|3.08|5.26|
|JSON to XML transformation HTTPS service|2G|100|50|0|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|0|1963|||0.01|0.15|1.68|
|JSON to XML transformation HTTPS service|2G|100|1024|0|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|0|1963|||0.13|0.17|1.50|
|JSON to XML transformation HTTPS service|2G|300|50|0|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|0|1963|||0.04|0.27|2.16|
|JSON to XML transformation HTTPS service|2G|300|1024|0|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|0|1963|||0.11|0.24|1.92|
|JSON to XML transformation HTTPS service|2G|1000|50|0|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|0|1963|||0.02|0.46|2.77|
|JSON to XML transformation HTTPS service|2G|1000|1024|0|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|-1|0|1963|||0.21|0.39|2.46|
