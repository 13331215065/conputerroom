<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/common/Head.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<meta charset="utf-8">
		<meta name="renderer" content="webkit|ie-comp|ie-stand">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
		<meta http-equiv="Cache-Control" content="no-siteapp" />
		<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5shiv.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>

<![endif]-->
		<script type="text/javascript" src="${basePath }/js/vue.min.js"></script>
		<script type="text/javascript" src="${basePath}/js/jquery.min.js"></script>
		<link rel="stylesheet" type="text/css" href="${basePath }/static/h-ui/css/H-ui.min.css" />
		<link rel="stylesheet" type="text/css" href="${basePath }/static/h-ui.admin/css/H-ui.admin.css" />
		<link rel="stylesheet" type="text/css" href="${basePath }/lib/Hui-iconfont/1.0.8/iconfont.css" />
		<link rel="stylesheet" type="text/css" href="${basePath }/static/h-ui.admin/skin/default/skin.css" id="skin" />
		<link rel="stylesheet" type="text/css" href="${basePath }/static/h-ui.admin/css/style.css" />
		<!--[if IE 6]>
<script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
		<title>网关设备管理</title>
	</head>

	<body>
		<div id="app">
		<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 总资产<span class="c-gray en">&gt;</span> 总资产
			<a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新"><i class="Hui-iconfont">&#xe68f;</i></a>
		</nav>
		<div class="page-container">
			<div class="text-c">
				<form class="Huiform" method="post" action="" target="_self">
					<span class="btn-upload form-group">
			<input class="input-text upload-url" type="text" name="uploadfile-2" id="uploadfile-2" readonly style="width:200px">
			<a href="javascript:void();" class="btn btn-primary upload-btn"><i class="Hui-iconfont">&#xe642;</i> 批量添加</a>
			<input type="file" multiple name="file-2" class="input-file">
			</span>
			<a  class="btn btn-success" id="" name=""  href="${basePath }/asset/goswitchboardAdd.do"><i class="Hui-iconfont">&#xe600;</i> 添加</a>
				</form>
			</div>
			<div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l"><a href="javascript:;" onclick="datadel()" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a></span> <span class="r">共有数据：<strong>54</strong> 条</span> </div>
			<div class="mt-20">
				<table class="table table-border table-bordered table-bg table-sort">
					<thead>
						<tr class="text-c">
							<th width=3%><input type="checkbox" name="" value="" ></th>
							<th width=8%>资产编号</th>
							<th width=8%>设备名称</th>
							<th width=10%>设备配置</th>
							<th width=10%>入库时间</th>
							<th width=10%>状态</th>
							<th width=20%>操作</th>
						</tr>
					</thead>
					<tbody>
					 <template v-for="switchboard in switchboards">
						   <tr class="text-c">
						     <td width=3%><input type="checkbox" name="" value="" ></td>
							<td>{{switchboard.id}}</td>
							<td>{{switchboard.name}}</td>
							<td>{{switchboard.switchboardConfig.config }}</td>
							<td>{{switchboard.inTime }}</td>
                            <td v-if="switchboard.repairState==0">正常</td>
                            <td v-if="switchboard.repairState==1">维修</td>
                            
							<td class="f-14 product-brand-manage">
								<a style="text-decoration:none" :href="'${basePath }/asset/goswitchboardEdit.do?id='+switchboard.id" title="编辑"><i class="Hui-iconfont">&#xe6df;</i></a>
								<a style="text-decoration:none" :onclick="'del('+switchboard.id+')'" title="删除"><i class="Hui-iconfont">&#xe6e2;</i></a>
								<a style="text-decoration:none" class="ml-5" onClick="active_del(this,'10001')" href="javascript:;" title="配置项"><i class="Hui-iconfont">&#xe61d;</i></a>
							    <a style="text-decoration:none" class="ml-5" onClick="active_del(this,'10001')" href="javascript:;" title="维修情况"><i class="Hui-iconfont">&#xe63c;</i></a>
							</td>				
						</tr>
	             	</template>
					</tbody>
				</table>
			</div>
		</div>
		<!--_footer 作为公共模版分离出去-->
		<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script>
		<script type="text/javascript" src="lib/layer/2.4/layer.js"></script>
		<script type="text/javascript" src="static/h-ui/js/H-ui.min.js"></script>
		<script type="text/javascript" src="static/h-ui.admin/js/H-ui.admin.js"></script>
		<!--/_footer 作为公共模版分离出去-->

		<!--请在下方写此页面业务相关的脚本-->
		<script type="text/javascript" src="lib/My97DatePicker/4.8/WdatePicker.js"></script>
		<script type="text/javascript" src="lib/datatables/1.10.0/jquery.dataTables.min.js"></script>
		<script type="text/javascript" src="lib/laypage/1.2/laypage.js"></script>
		<script type="text/javascript">
		    function del(id){
		    	if(confirm(id)){
		    		window.location.href="${basePath}/asset/delSwitchboardConfig.do?id="+id;
		    	}
		    }
		</script>
		<!-- <script type="text/javascript">
			$('.table-sort').dataTable({
				"aaSorting": [
					[1, "desc"]
				], //默认第几个排序
				"bStateSave": true, //状态保存
				"aoColumnDefs": [
					//{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
					{
						"orderable": false,
						"aTargets": [0, 6]
					} // 制定列不参与排序
				]
			});
		</script> -->
		</div>
		
	</body>
	<script type="text/javascript">
			var switchboards;	
			$.ajax({
				  	url:"${basePath}/asset/getSwitchboardData.do",
			    	dataType:"json",
			    	async:false,
			    	success:function(data){
			    		switchboards=data;
			    	}
			  });
			console.log(switchboards	);
			var vue=new Vue({
				el:"#app",
				data:{
					switchboards:switchboards
				}
			});
		</script>	
</html>