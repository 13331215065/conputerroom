<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/common/Head.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="Bookmark" href="/favicon.ico" >
<link rel="Shortcut Icon" href="/favicon.ico" />
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
<!--/meta 作为公共模版分离出去-->

<link href="lib/webuploader/0.1.5/webuploader.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div id="app">
<div class="page-container">
	<form action="${basePath }/asset/doswitchboardEdit.do" method="post" class="form form-horizontal" id="form-article-add">
		<input type="hidden" class="text" name="id" value="${asset.id }"/>
		<input type="hidden" class="text" name="configId" value="${asset.configId }"/>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>资产名：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${asset.name }" placeholder="" id="" name="name">
			</div>
		</div>	
		<input type="hidden" class="input-text" value="3" placeholder="" id="" name="assetType">	
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">合同编号：</label>
			<div class="formControls cdol-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${asset.comtract }" placeholder="" id="" name="comtract">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">配置：</label>
			<div class="formControls cdol-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${switchboard.config }" placeholder="" id="" name="config">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">机房：</label>
			
			<div class="formControls col-xs-8 col-sm-9">
				<select name="computerroom" class="select" > 
					<option value="1" <c:if test="${asset.computerroom==1}">selected="selected"</c:if>>网络机房</option>
					<option value="2" <c:if test="${asset.computerroom==2}">selected="selected"</c:if>>数据机房</option>
				</select>
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">机柜编号：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${asset.rackId}" placeholder="" id="" name="rackId">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">机柜内位置：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${asset.rack }" placeholder="" id="" name="rack">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">维保日期：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" name="warrantyTime" id="" placeholder="" value="${asset.warrantyTime }" class="input-text">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">维保联系方式：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" name="phone" id="" placeholder="" value="${asset.phone }" class="input-text">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">责任部门：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" name="responsibleBy" id="" placeholder="多个关键字用英文逗号隔开，限10个关键字" value="${asset.responsibleBy }" class="input-text">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">责任人：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" name="responsiblePersonName" id="" placeholder="" value="${asset.responsiblePersonName }" class="input-text">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">责任人联系方式：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" name="responsiblePersonPhone" id="" placeholder="" value="${asset.responsiblePersonPhone }" class="input-text">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">当前设备状态：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<select name="" class="select">
					<option value="0" <c:if test="${asset.repairState==0}">selected="selected"</c:if>>正常</option>
					<option value="1" <c:if test="${asset.repairState==1}">selected="selected"</c:if>>维修</option>
				</select>
			</div>
		</div>
		<div class="row cl">
			<div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-2">
				<button  class="btn btn-primary radius" type="submit"><i class="Hui-iconfont">&#xe632;</i> 保存并提交审核</button>
			</div>
		</div>
		
	</form>
</div>

<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="static/h-ui/js/H-ui.min.js"></script> 
<script type="text/javascript" src="static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="lib/My97DatePicker/4.8/WdatePicker.js"></script>
<script type="text/javascript" src="lib/jquery.validation/1.14.0/jquery.validate.js"></script> 
<script type="text/javascript" src="lib/jquery.validation/1.14.0/validate-methods.js"></script> 
<script type="text/javascript" src="lib/jquery.validation/1.14.0/messages_zh.js"></script>
<script type="text/javascript" src="lib/webuploader/0.1.5/webuploader.min.js"></script> 
<script type="text/javascript" src="lib/ueditor/1.4.3/ueditor.config.js"></script>
<script type="text/javascript" src="lib/ueditor/1.4.3/ueditor.all.min.js"> </script>
<script type="text/javascript" src="lib/ueditor/1.4.3/lang/zh-cn/zh-cn.js"></script>
</div>
</body>
<script type="text/javascript">
var vue = new Vue({
    el:"#app",
    data:{
        flag:true
    }
});

</script>
</html>